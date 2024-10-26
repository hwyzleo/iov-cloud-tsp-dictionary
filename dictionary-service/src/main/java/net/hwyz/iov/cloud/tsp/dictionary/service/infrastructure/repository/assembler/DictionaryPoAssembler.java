package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.assembler;

import net.hwyz.iov.cloud.tsp.dictionary.api.contract.request.DictionaryRequest;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * 数据字典数据对象转换类
 *
 * @author hwyz_leo
 */
@Mapper
public interface DictionaryPoAssembler {

    DictionaryPoAssembler INSTANCE = Mappers.getMapper(DictionaryPoAssembler.class);

    /**
     * 数据对象转数据传输对象
     *
     * @param dictionaryPo 数据对象
     * @return 数据传输对象
     */
    @Mappings({})
    DictionaryRequest toDto(DictionaryPo dictionaryPo);

    /**
     * 数据传输对象转数据对象
     *
     * @param accountDo 数据传输对象
     * @return 数据对象
     */
    @Mappings({})
    DictionaryPo fromDto(DictionaryRequest accountDo);

}
