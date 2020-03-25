-- 会用到3个数据库，02_sharding-jdbc-horizontal-database建了两个数据库：order_db_1、order_db_2
create database user_db character set 'utf8' collate 'utf8_general_ci';

-- 创建用户表：使用配置数据源 m0
create table user_db.t_user(
	user_id bigint(20) not null comment '用户id',
	user_name varchar(50) not null comment '用户姓名',
	status varchar(50) not null comment '用户状态',
	primary key (user_id)
);

-- 使用默认数据源 m0
CREATE TABLE user_db.t_user_2(
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `user_name` varchar(50) NOT NULL COMMENT '用户姓名',
  `status` varchar(50) NOT NULL COMMENT '用户状态',
  PRIMARY KEY (`user_id`)
);