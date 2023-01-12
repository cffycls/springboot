create table IF NOT EXISTS `User` (
    `id` INT UNSIGNED AUTO_INCREMENT,
    `name` VARCHAR(100) NOT NULL COMMENT '名称',
    `age` int unsigned NOT NULL DEFAULT 0 COMMENT '年龄',
    `birthday` DATE NOT NULL COMMENT '生日',
    `gender` enum('DEFAULT','MALE','FEMALE') NOT NULL DEFAULT 'DEFAULT' COMMENT '性别',
    `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY ( `id` )
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
