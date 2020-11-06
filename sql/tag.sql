/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.13-log : Database - tag
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tag` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tag`;

/*Table structure for table `idst_tag` */

DROP TABLE IF EXISTS `idst_tag`;

CREATE TABLE `idst_tag` (
  `cmp_nm` varchar(100) NOT NULL COMMENT '企业名称',
  `idst` varchar(100) NOT NULL COMMENT '所属行业',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `idst_tag` */

insert  into `idst_tag`(`cmp_nm`,`idst`,`update_time`) values ('上海寻梦信息技术有限公司','科技推广和应用服务业','2020-11-01 18:25:56'),('阿里巴巴（中国）网络技术有限公司','软件和信息技术服务业','2020-11-01 18:29:25'),('中国平安保险（集团）股份有限公司','保险业','2020-11-01 18:30:21');

/*Table structure for table `tag_query_log` */

DROP TABLE IF EXISTS `tag_query_log`;

CREATE TABLE `tag_query_log` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `tag_type` varchar(50) NOT NULL COMMENT '查询标签类型',
  `req_params` varchar(1000) NOT NULL COMMENT '请求参数',
  `ret_content` text NOT NULL COMMENT '返回结果',
  `result` tinyint(4) NOT NULL COMMENT '查询结果,0-查得,1-未查得,2-异常',
  `error_msg` varchar(1000) DEFAULT NULL COMMENT '错误信息',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tag_query_log` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
