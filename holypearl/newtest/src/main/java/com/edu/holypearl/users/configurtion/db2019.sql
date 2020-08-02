/*
 Navicat Premium Data Transfer

 Source Server         : loacl
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : db2019

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 01/08/2020 11:20:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for a
-- ----------------------------
DROP TABLE IF EXISTS `a`;
CREATE TABLE `a` (
  `a` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'ding');
INSERT INTO `user` VALUES (2, 'wei');
INSERT INTO `user` VALUES (3, 'liu');
INSERT INTO `user` VALUES (4, 'wang');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
