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

CREATE TABLE `sus_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(20) DEFAULT NULL COMMENT '用户名',
  `PASSWORD` varchar(20) DEFAULT NULL COMMENT '用户密码',
  `NICKNAME` varchar(20) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `sus_user` */

LOCK TABLES `sus_user` WRITE;

insert  into `sus_user`(`ID`,`USERNAME`,`PASSWORD`,`NICKNAME`) values (24,'kaka','kaka','KAKA');

UNLOCK TABLES;

/*Table structure for table `sys_menu` */

CREATE TABLE `sys_menu` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `MENUNAME` varchar(10) DEFAULT NULL COMMENT '菜单名称',
  `PARENTMENUID` int(11) DEFAULT NULL COMMENT '父菜单ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表：用来添加菜单';

/*Data for the table `sys_menu` */

LOCK TABLES `sys_menu` WRITE;

UNLOCK TABLES;

/*Table structure for table `sys_permission` */

CREATE TABLE `sys_permission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `MENUID` int(11) NOT NULL COMMENT '菜单ID',
  `ROLEID` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`ID`),
  KEY `FK_Reference_3` (`MENUID`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`MENUID`) REFERENCES `sys_menu` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表：关联角色表和菜单表\n';

/*Data for the table `sys_permission` */

LOCK TABLES `sys_permission` WRITE;

UNLOCK TABLES;

/*Table structure for table `sys_role` */

CREATE TABLE `sys_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `ROLENAME` varchar(20) DEFAULT NULL COMMENT '角色名',
  `DESCRIPTION` varchar(50) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `sys_role` */

LOCK TABLES `sys_role` WRITE;

UNLOCK TABLES;

/*Table structure for table `sys_userrole` */

CREATE TABLE `sys_userrole` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ROLEID` int(11) NOT NULL COMMENT '角色ID',
  `USERID` int(11) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表：用户表和角色表的中间表';

/*Data for the table `sys_userrole` */

LOCK TABLES `sys_userrole` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
