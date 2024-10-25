package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.dao;

import net.hwyz.iov.cloud.tsp.dictionary.service.BaseTest;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao.DictionaryCategoryDao;
import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryCategoryPo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 数据字典分类表 DAO 测试类
 *
 * @author hwyz_leo
 */
public class DictionaryCategoryDaoTest extends BaseTest {

    @Autowired
    private DictionaryCategoryDao dictionaryCategoryDao;

    @Test
    @Order(1)
    @DisplayName("新增一条记录")
    public void testInsertPo() throws Exception {
        DictionaryCategoryPo dictionaryCategoryPo = DictionaryCategoryPo.builder()
                .name("通用字典")
                .code("common")
                .type("SYSTEM")
                .enable(true)
                .sort(99)
                .build();
        dictionaryCategoryDao.insertPo(dictionaryCategoryPo);
    }

}
