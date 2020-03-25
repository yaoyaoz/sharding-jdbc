# Sharding-JDBC分库分表

## 一、概述

### 1、分库分表的方式

垂直分表：比如商品，把常用信息放一个表，不常用信息放到另一个表

垂直分库：按照业务将表进行分类。比如把店铺放到一个数据库，商品信息放到另一个数据库。（每个库可以放到不同的服务器）

水平分库：比如把店铺id为单数的放一个库，为双数的放在另外一个库

水平分表：比如把商品id为单数的放一张表，为双数的放在另一个表

### 2、分库分表带来的问题

事务一致性问题

跨节点关联查询

跨节点分页、排序函数

主键避重

公共表

### 3、sharding-jdbc介绍

是当当网研发的开源分布式数据库中间件

## 二、快速入门

### 1、环境搭建

创建数据库：order_db

建2张表：t_order_1、t_order_2

### 2、分片规则



准备看： 28 	07-理解读写分离



绑定表操作下也：两张不同的表分片键用同一个字段 试试



## 代码：

水平分表：01_sharding-jdbc-simple

水平分库：02_sharding-jdbc-horizontal-database：

> 在01_sharding-jdbc-simple的基础上修改
>
> 先根据user_id分库，再根据order_id分表

垂直分库：03_sharding-jdbc-vertical-database

公共表：04_sharding-jdbc-common-table