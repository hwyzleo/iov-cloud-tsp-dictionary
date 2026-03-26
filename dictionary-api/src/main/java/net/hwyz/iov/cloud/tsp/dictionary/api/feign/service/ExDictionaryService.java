package net.hwyz.iov.cloud.tsp.dictionary.api.feign.service;

import net.hwyz.iov.cloud.framework.common.constant.ServiceNameConstants;
import net.hwyz.iov.cloud.tsp.dictionary.api.feign.service.factory.ExDictionaryServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * 数据字典相关服务接口
 *
 * @author hwyz_leo
 */
@FeignClient(contextId = "exDictionaryService", value = ServiceNameConstants.TSP_DICTIONARY, path = "/service/dictionary", fallbackFactory = ExDictionaryServiceFallbackFactory.class)
public interface ExDictionaryService {

    /**
     * 根据字典代码获取数据字典
     *
     * @param code 字典代码
     * @return 数据字典
     */
    @GetMapping(value = "/{code}")
    List<Map<String, Object>> getDictionaryMap(@PathVariable("code") String code);

}
