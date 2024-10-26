package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao;

import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryColumnPo;
import net.hwyz.iov.cloud.tsp.framework.mysql.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据字典结构 DAO
 * </p>
 *
 * @author hwyz_leo
 * @since 2024-10-26
 */
@Mapper
public interface DictionaryColumnDao extends BaseDao<DictionaryColumnPo, Long> {

}
