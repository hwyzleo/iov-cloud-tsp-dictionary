package net.hwyz.iov.cloud.tsp.dictionary.service.application.service;

import net.hwyz.iov.cloud.tsp.dictionary.api.contract.request.DictionaryCategoryRequest;
import net.hwyz.iov.cloud.tsp.dictionary.api.contract.request.DictionaryColumnRequest;
import net.hwyz.iov.cloud.tsp.dictionary.api.contract.request.DictionaryRequest;
import net.hwyz.iov.cloud.tsp.dictionary.service.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据字典应用服务测试类
 *
 * @author hwyz_leo
 */
public class DictionaryAppServiceTest extends BaseTest {

    @Autowired
    private DictionaryAppService dictionaryAppService;

    @Test
    @Order(1)
    @DisplayName("创建数据字典")
    public void testCreateDictionary() throws Exception {
        DictionaryRequest request = DictionaryRequest.builder()
                .name("地区级行政区")
                .code("city")
                .categoryCode("city")
                .selectColumn("[{\"targetColumn\":\"province_code\",\"aliasName\":\"\"},{\"targetColumn\":\"code\",\"aliasName\":\"\"},{\"targetColumn\":\"name\",\"aliasName\":\"\"}]")
                .whereCondition("[]")
                .build();
        dictionaryAppService.createDictionary(request);
    }

}
