/*
Navicat MySQL Data Transfer

Source Server         : lx
Source Server Version : 50547
Source Host           : 101.200.190.81:3306
Source Database       : myweb

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2016-05-03 14:39:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for T_Article
-- ----------------------------
DROP TABLE IF EXISTS `T_Article`;
CREATE TABLE `T_Article` (
  `ART_ID` int(50) NOT NULL,
  `ART_Author` varchar(100) NOT NULL,
  `ART_Title` varchar(255) DEFAULT NULL,
  `ART_Mark` int(11) DEFAULT NULL,
  `ART_Content` varchar(255) DEFAULT NULL,
  `ART_Date` date DEFAULT NULL,
  `ART_Create_Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ART_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of T_Article
-- ----------------------------
INSERT INTO `T_Article` VALUES ('1', '罗祥', '第一篇日志', '2', 'one more night', '2015-05-13', '2016-05-03 14:39:21');
INSERT INTO `T_Article` VALUES ('2', '罗祥', '第二篇日志', '2', null, '2015-05-16', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('3', '罗祥', '第三篇日志', '2', null, '2015-05-17', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('4', '罗祥', '第四篇日志', '2', null, '2015-05-18', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('5', '罗祥', '第五篇日志', '2', null, '2015-05-19', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('6', '罗祥', '第六篇日志', '2', null, '2015-05-20', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('7', '罗祥', '第七篇日志', '2', null, '2015-05-21', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('8', '罗祥', '第八篇日志', '2', null, '2015-05-22', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('9', '罗祥', '第九篇日志', '2', null, '2015-05-23', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('10', '罗祥', '第十篇日志', '2', null, '2015-05-24', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('11', '罗祥', '第十一篇日志', '2', null, '2015-05-25', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('12', '罗祥', '第十二篇日志', '1', null, '2015-05-26', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('13', '罗祥', '第一篇日志', '5', '5', '2015-05-13', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('14', '罗祥', '第二篇日志', '5', '5', '2015-05-16', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('15', '罗祥', '第三篇日志', '5', '6', '2015-05-17', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('16', '罗祥', '第四篇日志', '6', '6', '2015-05-18', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('17', '罗祥', '第五篇日志', '6', '6', '2015-05-19', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('18', '罗祥', '第六篇日志', '6', '6', '2015-05-20', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('19', '罗祥', '第七篇日志', '3', '6', '2015-05-21', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('20', '罗祥', '第八篇日志', '3', '6', '2015-05-22', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('21', '罗祥', '第九篇日志', '4', '6', '2015-05-23', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('22', '罗祥', '第十篇日志', '4', '6', '2015-05-24', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('23', '罗祥', '第十一篇日志', '4', '6', '2015-05-25', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('24', '罗祥', '第十二篇日志', '4', '6', '2015-05-26', '2016-04-29 16:49:08');
INSERT INTO `T_Article` VALUES ('25', 'dfs', 'sdf', null, 'd', '0000-00-00', '0000-00-00 00:00:00');
INSERT INTO `T_Article` VALUES ('26', 'dsf', 'sdf', null, null, '0000-00-00', '0000-00-00 00:00:00');
INSERT INTO `T_Article` VALUES ('27', 'sdf', 'dsf', null, 'd', '0000-00-00', '0000-00-00 00:00:00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '12');
