/*
Navicat MySQL Data Transfer

Source Server         : jp
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : myweb

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-06-01 11:28:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_article`
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `article_id` int(50) NOT NULL AUTO_INCREMENT,
  `article_author` varchar(100) NOT NULL,
  `article_title` varchar(255) DEFAULT NULL,
  `article_content` varchar(255) DEFAULT NULL,
  `article_mark` varchar(255) NOT NULL,
  `article_date` date NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article
-- ----------------------------
INSERT INTO `t_article` VALUES ('1', '罗祥', '第一篇日志', null, '工作学习', '2015-05-13');
INSERT INTO `t_article` VALUES ('2', '罗祥', '第二篇日志', null, '工作学习', '2015-05-16');
INSERT INTO `t_article` VALUES ('3', '罗祥', '第三篇日志', null, '工作学习', '2015-05-17');
INSERT INTO `t_article` VALUES ('4', '罗祥', '第四篇日志', null, '工作学习', '2015-05-18');
INSERT INTO `t_article` VALUES ('5', '罗祥', '第五篇日志', null, '工作学习', '2015-05-19');
INSERT INTO `t_article` VALUES ('6', '罗祥', '第六篇日志', null, '工作学习', '2015-05-20');
INSERT INTO `t_article` VALUES ('7', '罗祥', '第七篇日志', null, '工作学习', '2015-05-21');
INSERT INTO `t_article` VALUES ('8', '罗祥', '第八篇日志', null, '工作学习', '2015-05-22');
INSERT INTO `t_article` VALUES ('9', '罗祥', '第九篇日志', null, '工作学习', '2015-05-23');
INSERT INTO `t_article` VALUES ('10', '罗祥', '第十篇日志', null, '工作学习', '2015-05-24');
INSERT INTO `t_article` VALUES ('11', '罗祥', '第十一篇日志', null, '工作学习', '2015-05-25');
INSERT INTO `t_article` VALUES ('12', '罗祥', '第十二篇日志', null, '工作学习', '2015-05-26');
