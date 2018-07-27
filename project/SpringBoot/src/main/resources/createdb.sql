#创建DB
drop database if exists mvctest;
create database mvctest;
#创建用户表
use mvctest;
drop table if exists mvctest.user;
create table mvctest.user (
  id int not null auto_increment primary key comment 'id',
  username varchar(100) not null comment '姓名',
  email varchar(100) not null comment '电子邮件',
  age int comment '年龄',
  phone varchar(20) comment '手机号码'
)engine=innodb auto_increment=1 comment '用户表' default charset=utf8 ;
#创建用户数据
insert into mvctest.user(username, email, age, phone) VALUES ("张三","zhangsan@23.com",18,"9384394394");
insert into mvctest.user(username, email, age, phone) VALUES ("李四","zhangsan@23.com",18,"9384394394");
insert into mvctest.user(username, email, age, phone) VALUES ("胜七","shengqi@23.com",18,"8989343343");
