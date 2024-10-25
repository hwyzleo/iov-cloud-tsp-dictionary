package net.hwyz.iov.cloud.tsp.dictionary.service.infrastructure.repository.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import net.hwyz.iov.cloud.tsp.framework.mysql.po.BasePo;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * <p>
 * 数据字典结构 数据对象
 * </p>
 *
 * @author hwyz_leo
 * @since 2024-10-25
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_dictionary_columns")
public class DictionaryColumnsPo extends BasePo {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 分类ID
     */
    @TableField("category_id")
    private Long categoryId;

    /**
     * 列名称
     */
    @TableField("name")
    private String name;

    /**
     * 列代码
     */
    @TableField("code")
    private String code;

    /**
     * 列类型
     */
    @TableField("type")
    private String type;

    /**
     * 列长度
     */
    @TableField("len")
    private Integer len;

    /**
     * 列是否可为空
     */
    @TableField("nullable")
    private Byte nullable;

    /**
     * 值类型
     */
    @TableField("value_type")
    private Short valueType;

    /**
     * 值范围
     */
    @TableField("value_range")
    private String valueRange;

    /**
     * 排序
     */
    @TableField("sort")
    private Integer sort;
}
