package net.hwyz.iov.cloud.tsp.dictionary.service.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hwyz.iov.cloud.tsp.dictionary.api.contract.request.DictionaryCategoryRequest;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao.DictionaryCategoryDao;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao.DictionaryColumnDao;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryCategoryPo;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryColumnPo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 数据字典分类应用服务类
 *
 * @author hwyz_leo
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DictionaryCategoryAppService {

    private final DictionaryColumnDao dictionaryColumnDao;
    private final DictionaryCategoryDao dictionaryCategoryDao;

    /**
     * 创建数据字典分类
     *
     * @param request 数据字典分类请求
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void createCategory(DictionaryCategoryRequest request) {
        DictionaryCategoryPo dictionaryCategoryPo = DictionaryCategoryPo.builder()
                .pid(request.getPid())
                .name(request.getName())
                .code(request.getCode())
                .type(request.getType())
                .enable(true)
                .sort(99)
                .build();
        dictionaryCategoryDao.insertPo(dictionaryCategoryPo);
        List<String> uniqueColumns = new ArrayList<>();
        List<DictionaryColumnPo> dictionaryColumnPoList = request.getColumns().stream()
                .map(column -> {
                    if (column.getUniq()) {
                        uniqueColumns.add(column.getCode());
                    }
                    return DictionaryColumnPo.builder()
                            .categoryId(dictionaryCategoryPo.getId())
                            .name(column.getName())
                            .code(column.getCode())
                            .type(column.getType())
                            .len(column.getLen())
                            .nullable(column.getNullable())
                            .uniq(column.getUniq())
                            .valueType(column.getValueType())
                            .valueRange(column.getValueRange())
                            .sort(99)
                            .build();
                }).collect(Collectors.toList());
        dictionaryColumnDao.batchInsertPo(dictionaryColumnPoList);
        dictionaryCategoryDao.createTable(request.getCode(), request.getName(), dictionaryColumnPoList, uniqueColumns);
    }

}
