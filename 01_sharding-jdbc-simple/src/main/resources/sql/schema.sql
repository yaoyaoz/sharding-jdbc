-- 创建数据库order_db
create database order_db character set 'utf8' collate 'utf8_general_ci';
use order_db;

-- 创建订单表
create table t_order_1(
	order_id bigint(20) not null comment '订单id',
	price decimal(10, 2) not null comment '订单价格',
	user_id bigint(20) not null comment '下单用户id',
	status varchar(50) not null comment '订单状态',
	primary key (order_id)
);

create table t_order_2(
	order_id bigint(20) not null comment '订单id',
	price decimal(10, 2) not null comment '订单价格',
	user_id bigint(20) not null comment '下单用户id',
	status varchar(50) not null comment '订单状态',
	primary key (order_id)
);
