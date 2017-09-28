/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.17-log : Database - kaka
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `name` varchar(10) DEFAULT NULL COMMENT '菜单名称',
  `perm` varchar(100) DEFAULT NULL COMMENT 'WildcardPermission',
  `url` varchar(100) DEFAULT NULL COMMENT '菜单url',
  `action` varchar(100) DEFAULT NULL COMMENT '菜单url',
  `iconcls` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `grade` tinyint(1) DEFAULT NULL COMMENT '级别',
  `state` tinyint(1) DEFAULT NULL COMMENT '菜单状态',
  `isleaf` tinyint(1) DEFAULT NULL COMMENT '叶子节点',
  `parentid` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建数据用户',
  `update_by` varchar(20) DEFAULT NULL COMMENT '更新数据用户',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
  `version` int(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表：用来添加菜单';

/*Data for the table `sys_menu` */

/*Table structure for table `sys_permission` */

DROP TABLE IF EXISTS `sys_permission`;

CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `menuid` bigint(20) NOT NULL COMMENT '菜单ID',
  `roleid` bigint(20) NOT NULL COMMENT '角色ID',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建数据用户',
  `update_by` varchar(20) DEFAULT NULL COMMENT '更新数据用户',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
  `version` int(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
  PRIMARY KEY (`id`),
  KEY `fk_permission_role` (`roleid`),
  KEY `fk_permission_menu` (`menuid`),
  CONSTRAINT `fk_permission_menu` FOREIGN KEY (`menuid`) REFERENCES `sys_menu` (`id`),
  CONSTRAINT `fk_permission_role` FOREIGN KEY (`roleid`) REFERENCES `sys_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表：关联角色表和菜单表';

/*Data for the table `sys_permission` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `rolename` varchar(20) DEFAULT NULL COMMENT '角色名',
  `description` varchar(50) DEFAULT NULL COMMENT '描述',
  `parent_id` int(11) DEFAULT NULL COMMENT '角色父id',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `state` tinyint(2) DEFAULT NULL COMMENT '状态',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建数据用户',
  `update_by` varchar(20) DEFAULT NULL COMMENT '更新数据用户',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
  `version` int(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `sys_role` */

insert  into `sys_role`(`id`,`rolename`,`description`,`parent_id`,`remark`,`state`,`create_by`,`update_by`,`create_date`,`update_date`,`del_flag`,`version`) values (665481517046652925,'系统测试角色',NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-17 09:04:22','2017-08-17 09:04:22',0,0),(665481517046652928,'系统测试角色',NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-17 09:04:22','2017-08-17 09:04:22',0,0);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `usertype` tinyint(2) DEFAULT NULL COMMENT '用户类型',
  `password` varchar(100) DEFAULT NULL COMMENT '用户密码',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `phone` int(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `alias` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `login_address` varchar(32) DEFAULT NULL COMMENT '最近登陆地址',
  `login_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近登陆时间',
  `ip` varchar(32) DEFAULT NULL COMMENT '登陆IP',
  `state` int(1) DEFAULT NULL COMMENT '用户状态',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建数据用户',
  `update_by` varchar(20) DEFAULT NULL COMMENT '更新数据用户',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
  `version` int(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`username`,`usertype`,`password`,`nickname`,`sex`,`phone`,`email`,`alias`,`login_address`,`login_date`,`ip`,`state`,`remark`,`create_by`,`update_by`,`create_date`,`update_date`,`del_flag`,`version`) values (663157522757910528,'kaka',NULL,'kaka','KAKA',NULL,NULL,NULL,NULL,NULL,'2017-08-11 14:09:39',NULL,NULL,NULL,'张三',NULL,'2017-08-11 14:09:39','2017-08-11 14:09:39',0,0),(663472537157787645,'chengli',NULL,'123456',NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-11 20:01:19',NULL,NULL,NULL,NULL,NULL,'2017-08-11 20:01:19','2017-08-11 20:01:19',0,0),(663472537157787648,'chengli',NULL,'123456',NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-11 20:01:19',NULL,NULL,NULL,NULL,NULL,'2017-08-11 20:01:19','2017-08-11 20:01:19',0,0);

/*Table structure for table `sys_userrole` */

DROP TABLE IF EXISTS `sys_userrole`;

CREATE TABLE `sys_userrole` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `roleid` bigint(20) NOT NULL COMMENT '角色ID',
  `userid` bigint(20) NOT NULL COMMENT '用户ID',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `create_by` varchar(20) DEFAULT NULL COMMENT '创建数据用户',
  `update_by` varchar(20) DEFAULT NULL COMMENT '更新数据用户',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建数据时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` int(1) NOT NULL DEFAULT '0' COMMENT '删除标记：0正常 1不正常',
  `version` int(5) NOT NULL DEFAULT '0' COMMENT '数据版本',
  PRIMARY KEY (`id`),
  KEY `fk_userRole_user` (`userid`),
  KEY `fk_userRole_role` (`roleid`),
  CONSTRAINT `fk_userRole_role` FOREIGN KEY (`roleid`) REFERENCES `sys_role` (`id`),
  CONSTRAINT `fk_userRole_user` FOREIGN KEY (`userid`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户角色表：用户表和角色表的中间表';

/*Data for the table `sys_userrole` */

insert  into `sys_userrole`(`id`,`roleid`,`userid`,`remark`,`create_by`,`update_by`,`create_date`,`update_date`,`del_flag`,`version`) values (665481517046652929,665481517046652928,663472537157787648,NULL,NULL,NULL,'2017-08-17 09:04:22','2017-08-17 09:04:22',0,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
