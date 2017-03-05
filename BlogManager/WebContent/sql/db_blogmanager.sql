/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50149
Source Host           : localhost:3306
Source Database       : db_blogmanager

Target Server Type    : MYSQL
Target Server Version : 50149
File Encoding         : 65001

Date: 2017-02-28 00:20:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_consumer`
-- ----------------------------
DROP TABLE IF EXISTS `t_consumer`;
CREATE TABLE `t_consumer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `userpwd` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `birthday` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `photourl` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=116 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of t_consumer
-- ----------------------------
INSERT INTO `t_consumer` VALUES ('3', 'lkw', '123', '卢科伟1', '男', '1994-05-18', '51342@qq.com', 'photos/1487657283440.jpg');
INSERT INTO `t_consumer` VALUES ('4', 'tc', '123', '田聪1', '男', '1994-05-01', '546351019@qq.com', 'photos/1487657283440.jpg');
INSERT INTO `t_consumer` VALUES ('6', 'pjh', '123', '彭金红', '男', '1994-05-01', '546@qq.com', 'photos/1487657283440.jpg');
INSERT INTO `t_consumer` VALUES ('8', 'xj', '123', '夏俊', '女', '1994-05-01', '546351019@qq.com', 'photos/1487657283440.jpg');
INSERT INTO `t_consumer` VALUES ('9', 'ls', '1234', '卢梭', '女', '1994-05-01', '546351019@qq.com', 'photos/1487657283440.jpg');
INSERT INTO `t_consumer` VALUES ('17', 'root', 'root', '张三7', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('18', 'root', 'root', '张三8', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('19', 'root', 'root', '张三9', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('22', 'root', 'root', '张三12', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('23', 'root', 'root', '张三13', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('24', 'root', 'root', '张三14', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('25', 'root', 'root', '张三15', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('26', 'root', 'root', '张三16', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('27', 'root', 'root', '张三17', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('28', 'root', 'root', '张三18', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('29', 'root', 'root', '张三19', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('30', 'root', 'root', '张三20', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('31', 'root', 'root', '张三21', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('32', 'root', 'root', '张三22', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('33', 'root', 'root', '张三23', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('48', 'root', 'root', '张三38', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('49', 'root', 'root', '张三39', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('50', 'root', 'root', '张三40', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('51', 'root', 'root', '张三41', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('52', 'root', 'root', '张三42', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('53', 'root', 'root', '张三43', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('54', 'root', 'root', '张三44', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('55', 'root', 'root', '张三45', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('56', 'root', 'root', '张三46', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('57', 'root', 'root', '张三47', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('58', 'root', 'root', '张三48', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('59', 'root', 'root', '张三49', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('60', 'root', 'root', '张三50', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('61', 'root', 'root', '张三51', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('62', 'root', 'root', '张三52', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('63', 'root', 'root', '张三53', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('64', 'root', 'root', '张三54', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('65', 'root', 'root', '张三55', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('66', 'root', 'root', '张三56', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('67', 'root', 'root', '张三57', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('68', 'root', 'root', '张三58', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('69', 'root', 'root', '张三59', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('70', 'root', 'root', '张三60', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('71', 'root', 'root', '张三61', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('72', 'root', 'root', '张三62', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('73', 'root', 'root', '张三63', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('74', 'root', 'root', '张三64', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('75', 'root', 'root', '张三65', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('76', 'root', 'root', '张三66', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('77', 'root', 'root', '张三67', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('78', 'root', 'root', '张三68', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('79', 'root', 'root', '张三69', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('80', 'root', 'root', '张三70', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('81', 'root', 'root', '张三71', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('82', 'root', 'root', '张三72', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('83', 'root', 'root', '张三73', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('84', 'root', 'root', '张三74', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('85', 'root', 'root', '张三75', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('86', 'root', 'root', '张三76', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('87', 'root', 'root', '张三77', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('88', 'root', 'root', '张三78', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('89', 'root', 'root', '张三79', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('90', 'root', 'root', '张三80', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('91', 'root', 'root', '张三81', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('92', 'root', 'root', '张三82', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('93', 'root', 'root', '张三83', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('94', 'root', 'root', '张三84', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('95', 'root', 'root', '张三85', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('96', 'root', 'root', '张三86', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('107', 'root', 'root', '张三97', '女', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('108', 'root', 'root', '张三98', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('109', 'root', 'root', '张三99', '男', '1994-05-01', '12@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('110', 'root', 'root', '叶玉豪', '男', '1994-05-01', '1321@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('111', 'root', 'root', '卢宇', '女', '1994-05-01', '532@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('112', 'root', 'root', '折颜', '女', '1994-05-01', '532@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('113', 'root', 'root', '凤九', '女', '1994-05-01', '32@qq.com', 'photos/admin.jpg');
INSERT INTO `t_consumer` VALUES ('114', 'root', 'root', '赵霞', '女', '2017-02-07', '22@qq.com', 'photos/admin.jpg');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `userpwd` varchar(50) DEFAULT NULL,
  `imgurl` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '超级管理员', 'admin', '6135766e4176547758416b3d', 'photos/admin.jpg');
INSERT INTO `t_user` VALUES ('2', '卢科伟', 'lkw', '6135766e4176547758416b3d', 'photos/20150923180947807.png');
