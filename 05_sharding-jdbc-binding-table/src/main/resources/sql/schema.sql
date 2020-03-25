-- 使用order_db_1数据库来测试，用到4张表：t_order_1、t_order_2；t_order_item_1、t_order_item_2

-- 创建公共表
create table order_db_1.t_order_item_1(
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `price` decimal(10,2) NOT NULL COMMENT '订单价格',
  `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
  `status` varchar(50) NOT NULL COMMENT '订单状态',
  `goods_id` varchar(50) NOT NULL COMMENT '商品id',
  PRIMARY KEY (`order_id`)
);
create table order_db_1.t_order_item_2(
  `order_id` bigint(20) NOT NULL COMMENT '订单id',
  `price` decimal(10,2) NOT NULL COMMENT '订单价格',
  `user_id` bigint(20) NOT NULL COMMENT '下单用户id',
  `status` varchar(50) NOT NULL COMMENT '订单状态',
  `goods_id` varchar(50) NOT NULL COMMENT '商品id',
  PRIMARY KEY (`order_id`)
);
