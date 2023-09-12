# 建表脚本
# @author <a href="https://zhy648.club/">随缘而愈</a>


-- 创建库
create database if not exists tjrac;

-- 切换库
use tjrac;

-- 用户表
create table if not exists tb_stu
(
    id          bigint auto_increment   comment 'id' primary key,
    stu_name  varchar(50)                          comment '学生姓名',
    stu_age     int                                comment '学生年龄',
    stu_gender     varchar(4)                      comment '性别',
    stu_hobby  varchar(256)                        comment '学生爱好',
    stu_img  varchar(256)                          comment '学生照片',
    stu_address  varchar(256)                      comment '地址',
    stu_remark  varchar(256)                       comment '备注',
    stu_enrol_date  date                           comment '入学时间',
    cid  int                         comment '班级id',
    index idx_userName (stu_name)
) comment '学生表' collate = utf8mb4_unicode_ci;

create table if not exists tb_class
(
    id           int comment 'id' primary key,
    cls_name  varchar(256)                          comment '班级名称',
    cls_size  int                comment '班级人数'
)comment '班级表' collate = utf8mb4_unicode_ci;

-- 加外键约束
alter table tb_stu
    add constraint tb_stu_tb_class_i_fk
        foreign key (cid) references tb_class (id);