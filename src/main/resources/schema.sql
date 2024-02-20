DROP TABLE IF EXISTS `mobile_food_info`;
CREATE TABLE `mobile_food_info`
(
    `id`                   bigint    NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `locationid`           bigint             DEFAULT NULL COMMENT '位置ID',
    `applicant`            varchar(255)        DEFAULT NULL COMMENT '申请人',
    `facility_type`        varchar(20)        DEFAULT NULL COMMENT '设施类型',
    `cnn`                  varchar(20)        DEFAULT NULL COMMENT 'cnn',
    `location_description` varchar(255)       DEFAULT NULL COMMENT '位置描述',
    `address`              varchar(255)       DEFAULT NULL COMMENT '地址',
    `permit`               varchar(20)        DEFAULT NULL COMMENT '允许',
    `status`               varchar(20)        DEFAULT NULL COMMENT '状态',
    `food_items`           text               DEFAULT NULL COMMENT '食品',

    `created_at`           timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at`           timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted`              char(1)   NOT NULL DEFAULT '0' COMMENT '逻辑删除 1已删',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
