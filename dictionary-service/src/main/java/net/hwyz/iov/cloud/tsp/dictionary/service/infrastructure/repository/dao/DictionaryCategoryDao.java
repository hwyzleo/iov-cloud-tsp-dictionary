package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.dao;

import net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po.DictionaryCategoryPo;
import net.hwyz.iov.cloud.tsp.framework.mysql.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 数据字典分类 DAO
 * </p>
 *
 * @author hwyz_leo
 * @since 2024-10-25
 */
@Mapper
public interface DictionaryCategoryDao extends BaseDao<DictionaryCategoryPo, Long> {

}
