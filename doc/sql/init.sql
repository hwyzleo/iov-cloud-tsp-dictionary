DROP TABLE IF EXISTS `db_dictionary`.`tb_dictionary_category`;
CREATE TABLE `db_dictionary`.`tb_dictionary_category`
(
    `id`          BIGINT       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `pid`         BIGINT                DEFAULT NULL COMMENT '上级分类ID',
    `name`        VARCHAR(255) NOT NULL COMMENT '分类名称',
    `code`        VARCHAR(255) NOT NULL COMMENT '分类代码',
    `type`        VARCHAR(255)          DEFAULT NULL COMMENT '分类类型',
    `enable`      TINYINT      NOT NULL COMMENT '是否启用',
    `sort`        INT          NOT NULL COMMENT '排序',
    `description` VARCHAR(255)          DEFAULT NULL COMMENT '备注',
    `create_time` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `create_by`   BIGINT                DEFAULT NULL COMMENT '创建者',
    `modify_time` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    `modify_by`   BIGINT                DEFAULT NULL COMMENT '修改者',
    `row_version` INT                   DEFAULT NULL COMMENT '记录版本',
    `row_valid`   TINYINT               DEFAULT NULL COMMENT '是否有效',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='数据字典分类';

DROP TABLE IF EXISTS `db_dictionary`.`tb_dictionary_columns`;
CREATE TABLE `db_dictionary`.`tb_dictionary_columns`
(
    `id`          BIGINT       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `category_id` BIGINT       NOT NULL COMMENT '分类ID',
    `name`        VARCHAR(255) NOT NULL COMMENT '列名称',
    `code`        VARCHAR(255) NOT NULL COMMENT '列代码',
    `type`        VARCHAR(255) NOT NULL COMMENT '列类型',
    `len`         INT          NOT NULL COMMENT '列长度',
    `nullable`    TINYINT      NOT NULL COMMENT '列是否可为空',
    `value_type`  SMALLINT     NOT NULL COMMENT '值类型',
    `value_range` VARCHAR(255)          DEFAULT NULL COMMENT '值范围',
    `sort`        INT          NOT NULL COMMENT '排序',
    `description` VARCHAR(255)          DEFAULT NULL COMMENT '备注',
    `create_time` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `create_by`   BIGINT                DEFAULT NULL COMMENT '创建者',
    `modify_time` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    `modify_by`   BIGINT                DEFAULT NULL COMMENT '修改者',
    `row_version` INT                   DEFAULT NULL COMMENT '记录版本',
    `row_valid`   TINYINT               DEFAULT NULL COMMENT '是否有效',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='数据字典结构';

DROP TABLE IF EXISTS `db_dictionary`.`tb_dictionary`;
CREATE TABLE `db_dictionary`.`tb_dictionary`
(
    `id`              BIGINT       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name`            VARCHAR(255) NOT NULL COMMENT '字典名称',
    `code`            VARCHAR(255) NOT NULL COMMENT '字典代码',
    `category_code`   VARCHAR(255) NOT NULL COMMENT '字典分类代码',
    `select_column`   JSON         NOT NULL COMMENT '所选列',
    `where_condition` JSON         NOT NULL COMMENT '指定条件',
    `enable`          TINYINT      NOT NULL COMMENT '是否启用',
    `sort`            INT          NOT NULL COMMENT '排序',
    `description`     VARCHAR(255)          DEFAULT NULL COMMENT '备注',
    `create_time`     TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `create_by`       BIGINT                DEFAULT NULL COMMENT '创建者',
    `modify_time`     TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    `modify_by`       BIGINT                DEFAULT NULL COMMENT '修改者',
    `row_version`     INT                   DEFAULT NULL COMMENT '记录版本',
    `row_valid`       TINYINT               DEFAULT NULL COMMENT '是否有效',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='数据字典';