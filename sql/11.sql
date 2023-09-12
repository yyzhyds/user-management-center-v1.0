# 建表脚本
# @author <a href="https://zhy648.club/">随缘而愈</a>


-- 创建库
create database if not exists tjrac;

-- 切换库
use tjrac;

-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    userName  varchar(256)                           not null comment '账号',
    userPassword varchar(100)                           not null comment '密码',
    userPhone     varchar(256)                           null comment '用户电话',
    userMail   varchar(512)                          null comment '用户邮箱',
    -- userRole     varchar(256) default 'user'            not null comment '用户角色：user/admin',
    -- createTime   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    -- updateTime   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    -- isDelete     tinyint      default 0                 not null comment '是否删除',
    index idx_userName (userName)
) comment '用户' collate = utf8mb4_unicode_ci;