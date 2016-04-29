/*
Navicat MySQL Data Transfer

Source Server         : localhost_lx
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : myweb

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2016-04-29 11:56:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `article_id` int(50) NOT NULL AUTO_INCREMENT,
  `article_author` varchar(100) NOT NULL,
  `article_title` varchar(255) DEFAULT NULL,
  `article_mark` int(11) DEFAULT NULL,
  `article_content` varchar(255) DEFAULT NULL,
  `article_date` date NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article
-- ----------------------------
INSERT INTO `t_article` VALUES ('1', '罗祥', '第一篇日志', '2', null, '2015-05-13');
INSERT INTO `t_article` VALUES ('2', '罗祥', '第二篇日志', '2', null, '2015-05-16');
INSERT INTO `t_article` VALUES ('3', '罗祥', '第三篇日志', '2', null, '2015-05-17');
INSERT INTO `t_article` VALUES ('4', '罗祥', '第四篇日志', '2', null, '2015-05-18');
INSERT INTO `t_article` VALUES ('5', '罗祥', '第五篇日志', '2', null, '2015-05-19');
INSERT INTO `t_article` VALUES ('6', '罗祥', '第六篇日志', '2', null, '2015-05-20');
INSERT INTO `t_article` VALUES ('7', '罗祥', '第七篇日志', '2', null, '2015-05-21');
INSERT INTO `t_article` VALUES ('8', '罗祥', '第八篇日志', '2', null, '2015-05-22');
INSERT INTO `t_article` VALUES ('9', '罗祥', '第九篇日志', '2', null, '2015-05-23');
INSERT INTO `t_article` VALUES ('10', '罗祥', '第十篇日志', '2', null, '2015-05-24');
INSERT INTO `t_article` VALUES ('11', '罗祥', '第十一篇日志', '2', null, '2015-05-25');
INSERT INTO `t_article` VALUES ('12', '罗祥', '第十二篇日志', '1', null, '2015-05-26');
INSERT INTO `t_article` VALUES ('13', '罗祥', '第一篇日志', '5', '5', '2015-05-13');
INSERT INTO `t_article` VALUES ('14', '罗祥', '第二篇日志', '5', '5', '2015-05-16');
INSERT INTO `t_article` VALUES ('15', '罗祥', '第三篇日志', '5', '6', '2015-05-17');
INSERT INTO `t_article` VALUES ('16', '罗祥', '第四篇日志', '6', '6', '2015-05-18');
INSERT INTO `t_article` VALUES ('17', '罗祥', '第五篇日志', '6', '6', '2015-05-19');
INSERT INTO `t_article` VALUES ('18', '罗祥', '第六篇日志', '6', '6', '2015-05-20');
INSERT INTO `t_article` VALUES ('19', '罗祥', '第七篇日志', '3', '6', '2015-05-21');
INSERT INTO `t_article` VALUES ('20', '罗祥', '第八篇日志', '3', '6', '2015-05-22');
INSERT INTO `t_article` VALUES ('21', '罗祥', '第九篇日志', '4', '6', '2015-05-23');
INSERT INTO `t_article` VALUES ('22', '罗祥', '第十篇日志', '4', '6', '2015-05-24');
INSERT INTO `t_article` VALUES ('23', '罗祥', '第十一篇日志', '4', '6', '2015-05-25');
INSERT INTO `t_article` VALUES ('24', '罗祥', '第十二篇日志', '4', '6', '2015-05-26');
