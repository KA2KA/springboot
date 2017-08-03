/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.18-0ubuntu0.17.04.1 : Database - KAKA
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`KAKA` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `sus_user` */

CREATE TABLE `sys_user` (
  `id` INT(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` VARCHAR(20) DEFAULT NULL COMMENT '用户名',
  `usertype` TINYINT(2) DEFAULT NULL  COMMENT '用户类型',
  `password` VARCHAR(100) DEFAULT NULL COMMENT '用户密码',
  `nickname` VARCHAR(20) DEFAULT NULL COMMENT '昵称',
  `phone` INT(11) DEFAULT  NULL  COMMENT '手机号',
  `email` VARCHAR (100) DEFAULT  NULL  COMMENT '邮箱',
  `alias` VARCHAR(100) DEFAULT  NULL  COMMENT '用户头像',
  `login_address`  VARCHAR (32) DEFAULT  NULL  COMMENT '最近登陆地址',
  `login_date` TIMESTAMP  DEFAULT  NULL  COMMENT '最近登陆时间',
  `ip` VARCHAR (32) DEFAULT  NULL  COMMENT '登陆IP',
  `state` INT(1) DEFAULT  NULL  COMMENT '用户状态',
  `remark` VARCHAR(100) DEFAULT  NULL  COMMENT '备注',
  `create_by` VARCHAR(20)   DEFAULT NULL COMMENT '创建数据用户',
  `update_by` VARCHAR(20)   DEFAULT NULL COMMENT '更新数据用户',
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP  COMMENT '创建数据时间',
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` INT(1)  NOT NULL DEFAULT  0 COMMENT '删除标记：0正常 1不正常',
  `version` INT(5)  NOT NULL DEFAULT  0 COMMENT '数据版本',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `sus_user` */

LOCK TABLES `sus_user` WRITE;

UNLOCK TABLES;
/*Table structure for table `sys_role` */

CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `rolename` varchar(20) DEFAULT NULL COMMENT '角色名',
  `description` varchar(50) DEFAULT NULL COMMENT '描述',
  `parent_id` INT(11)  DEFAULT NULL  COMMENT '角色父id',
  `remark` VARCHAR(100) DEFAULT  NULL  COMMENT '备注',
  `create_by` VARCHAR(20)   DEFAULT NULL COMMENT '创建数据用户',
  `update_by` VARCHAR(20)   DEFAULT NULL COMMENT '更新数据用户',
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP  COMMENT '创建数据时间',
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` INT(1)  NOT NULL DEFAULT  0 COMMENT '删除标记：0正常 1不正常',
  `version` INT(5)  NOT NULL DEFAULT  0 COMMENT '数据版本',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `sys_role` */

LOCK TABLES `sys_role` WRITE;

UNLOCK TABLES;

/*Table structure for table `sys_userrole` */

CREATE TABLE `sys_userrole` (

  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `roleid` int(11) NOT NULL COMMENT '角色ID',
  `userid` int(11) NOT NULL COMMENT '用户ID',
  `remark` VARCHAR(100) DEFAULT  NULL  COMMENT '备注',
  `create_by` VARCHAR(20)   DEFAULT NULL COMMENT '创建数据用户',
  `update_by` VARCHAR(20)   DEFAULT NULL COMMENT '更新数据用户',
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP  COMMENT '创建数据时间',
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` INT(1)  NOT NULL DEFAULT  0 COMMENT '删除标记：0正常 1不正常',
  `version` INT(5)  NOT NULL DEFAULT  0 COMMENT '数据版本',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表：用户表和角色表的中间表';

/*Data for the table `sys_userrole` */

LOCK TABLES `sys_userrole` WRITE;

UNLOCK TABLES;





/*Table structure for table `sys_menu` */

CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menuName` varchar(10) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(100) DEFAULT NULL COMMENT '菜单url',
  `action` varchar(100) DEFAULT NULL COMMENT '菜单url',
  `iconcls` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `grade` TINYINT(1) DEFAULT  NULL COMMENT '级别',
  `state` TINYINT(1) DEFAULT  NULL  COMMENT '菜单状态',
  `isleaf` TINYINT(1) DEFAULT null COMMENT '叶子节点',
  `parentid` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `remark` VARCHAR(100) DEFAULT  NULL  COMMENT '备注',
  `create_by` VARCHAR(20)   DEFAULT NULL COMMENT '创建数据用户',
  `update_by` VARCHAR(20)   DEFAULT NULL COMMENT '更新数据用户',
  `create_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP  COMMENT '创建数据时间',
  `update_date` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新数据时间',
  `del_flag` INT(1)  NOT NULL DEFAULT  0 COMMENT '删除标记：0正常 1不正常',
  `version` INT(5)  NOT NULL DEFAULT  0 COMMENT '数据版本',


  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表：用来添加菜单';

/*Data for the table `sys_menu` */

LOCK TABLES `sys_menu` WRITE;

UNLOCK TABLES;

/*Table structure for table `sys_permission` */

CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `menuid` int(11) NOT NULL COMMENT '菜单ID',
  `roleid` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`),
  KEY `FK_Reference_3` (`menuid`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`menuid`) REFERENCES `sys_menu` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表：关联角色表和菜单表\n';

/*Data for the table `sys_permission` */

LOCK TABLES `sys_permission` WRITE;

UNLOCK TABLES;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
