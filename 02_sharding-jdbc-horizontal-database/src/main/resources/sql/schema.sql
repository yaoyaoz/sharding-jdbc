-- 创建数据库order_db1、order_db2
create database order_db_1 character set 'utf8' collate 'utf8_general_ci';
create database order_db_2 character set 'utf8' collate 'utf8_general_ci';

-- 创建订单表（order_db1）
create table order_db_1.t_order_1(
	order_id bigint(20) not null comment '订单id',
	price decimal(10, 2) not null comment '订单价格',
	user_id bigint(20) not null comment '下单用户id',
	status varchar(50) not null comment '订单状态',
	primary key (order_id)
);
create table order_db_1.t_order_2(
	order_id bigint(20) not null comment '订单id',
	price decimal(10, 2) not null comment '订单价格',
	user_id bigint(20) not null comment '下单用户id',
	status varchar(50) not null comment '订单状态',
	primary key (order_id)
);

-- 创建订单表（order_db2）
create table order_db_2.t_order_1(
	order_id bigint(20) not null comment '订单id',
	price decimal(10, 2) not null comment '订单价格',
	user_id bigint(20) not null comment '下单用户id',
	status varchar(50) not null comment '订单状态',
	primary key (order_id)
);

create table order_db_2.t_order_2(
	order_id bigint(20) not null comment '订单id',
	price decimal(10, 2) not null comment '订单价格',
	user_id bigint(20) not null comment '下单用户id',
	status varchar(50) not null comment '订单状态',
	primary key (order_id)
);
