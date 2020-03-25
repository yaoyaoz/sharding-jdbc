-- 建一张公共表t_dict(让3个数据库：order_db、order_db_1、order_db_2共用)

-- 创建公共表
create table order_db.t_dict(
    code varchar(50) not null comment '编号',
	value bigint(20) not null comment '值',
	msg varchar(50) not null comment '描述'
);
create table order_db_1.t_dict(
    code varchar(50) not null comment '编号',
	value bigint(20) not null comment '值',
	msg varchar(50) not null comment '描述'
);
create table order_db_2.t_dict(
    code varchar(50) not null comment '编号',
	value bigint(20) not null comment '值',
	msg varchar(50) not null comment '描述'
);
