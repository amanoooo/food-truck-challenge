DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    `id`         bigint    NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`       varchar(255)       DEFAULT NULL COMMENT '姓名',
    `phone`      varchar(20)        DEFAULT NULL COMMENT '头像',
    `age`        int                DEFAULT NULL COMMENT '年龄',
    `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `deleted`    char(1)   NOT NULL DEFAULT '0' COMMENT '逻辑删除 1已删',
    PRIMARY KEY (`id`),
    KEY          `phone_idx` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;