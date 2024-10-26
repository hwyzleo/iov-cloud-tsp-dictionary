package net.hwyz.iov.cloud.tsp.dictionary.api.feign.service;

import java.util.List;
import java.util.Map;

/**
 * 数据字典相关服务接口
 *
 * @author hwyz_leo
 */
public interface DictionaryServiceApi {

    /**
     * 根据字典代码获取数据字典
     *
     * @param code 字典代码
     * @return 数据字典
     */
    List<Map<String, Object>> getDictionaryMap(String code);

}
