package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao;

import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryPo;
import net.hwyz.iov.cloud.tsp.framework.mysql.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据字典 DAO
 * </p>
 *
 * @author hwyz_leo
 * @since 2024-10-25
 */
@Mapper
public interface DictionaryDao extends BaseDao<DictionaryPo, Long> {

}
