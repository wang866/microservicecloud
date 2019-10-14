/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : clouddb02

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2019-10-14 18:06:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', 'clouddb02');
INSERT INTO `dept` VALUES ('2', '人事部', 'clouddb02');
INSERT INTO `dept` VALUES ('3', '财务部', 'clouddb02');
INSERT INTO `dept` VALUES ('4', '市场部', 'clouddb02');
INSERT INTO `dept` VALUES ('5', '运维部', 'clouddb02');
INSERT INTO `dept` VALUES ('6', '2019', 'clouddb02');
