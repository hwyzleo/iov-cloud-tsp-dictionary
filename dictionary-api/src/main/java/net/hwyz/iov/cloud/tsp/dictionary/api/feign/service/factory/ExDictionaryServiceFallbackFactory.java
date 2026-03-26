package net.hwyz.iov.cloud.tsp.dictionary.api.feign.service.factory;

import lombok.extern.slf4j.Slf4j;
import net.hwyz.iov.cloud.tsp.dictionary.api.feign.service.ExDictionaryService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 数据字典相关服务降级处理
 *
 * @author hwyz_leo
 */
@Slf4j
@Component
public class ExDictionaryServiceFallbackFactory implements FallbackFactory<ExDictionaryService> {

    @Override
    public ExDictionaryService create(Throwable throwable) {
        return new ExDictionaryService() {
            @Override
            public List<Map<String, Object>> getDictionaryMap(String code) {
                logger.error("数据字典服务根据字典代码[{}]获取数据字典调用失败", code, throwable);
                return null;
            }
        };
    }
}
