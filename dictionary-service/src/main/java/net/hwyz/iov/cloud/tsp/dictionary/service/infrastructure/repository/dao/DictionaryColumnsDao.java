package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao;

import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryColumnsPo;
import net.hwyz.iov.cloud.tsp.framework.mysql.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据字典结构 DAO
 * </p>
 *
 * @author hwyz_leo
 * @since 2024-10-25
 */
@Mapper
public interface DictionaryColumnsDao extends BaseDao<DictionaryColumnsPo, Long> {

}
