/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : clean

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 09/09/2023 20:03:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `dynamicid` int NOT NULL COMMENT '动态id',
  `parentcommentid` int DEFAULT '-1' COMMENT '父亲评论',
  `content` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '评论内容',
  `createtime` datetime DEFAULT NULL,
  `isdel` int DEFAULT '1' COMMENT '0为删除  1为正常',
  `isabled` int DEFAULT '1' COMMENT '0为删除  1为正常',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
INSERT INTO `comment` (`id`, `userid`, `dynamicid`, `parentcommentid`, `content`, `createtime`, `isdel`, `isabled`) VALUES (26, 10, 55, -1, '第一条👍👍👍', '2021-11-14 10:38:42', 1, 1);
INSERT INTO `comment` (`id`, `userid`, `dynamicid`, `parentcommentid`, `content`, `createtime`, `isdel`, `isabled`) VALUES (27, 10, 62, -1, '测试评论功能😘😘😘😘', '2021-11-14 13:32:03', 1, 1);
INSERT INTO `comment` (`id`, `userid`, `dynamicid`, `parentcommentid`, `content`, `createtime`, `isdel`, `isabled`) VALUES (28, 10, 62, 27, '测试测试', '2021-11-14 13:32:10', 1, 1);
INSERT INTO `comment` (`id`, `userid`, `dynamicid`, `parentcommentid`, `content`, `createtime`, `isdel`, `isabled`) VALUES (29, 10, 69, -1, '第一条评论😈', '2021-11-15 09:32:19', 1, 1);
INSERT INTO `comment` (`id`, `userid`, `dynamicid`, `parentcommentid`, `content`, `createtime`, `isdel`, `isabled`) VALUES (30, 10, 69, 29, '第一条评论的第一条评论😂', '2021-11-15 09:32:43', 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for dynamic
-- ----------------------------
DROP TABLE IF EXISTS `dynamic`;
CREATE TABLE `dynamic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL COMMENT '用户id',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `content` varchar(10000) DEFAULT NULL COMMENT '动态内容',
  `mediumaddress` varchar(1000) DEFAULT NULL COMMENT '动态的照片或者视频地址   1为视频  2为照片  0为没有',
  `type` int DEFAULT NULL COMMENT '动态是视频还是照片',
  `likeNum` int DEFAULT '0' COMMENT '点赞的数量',
  `isdel` bigint DEFAULT '1' COMMENT '是否删除',
  `isabled` bigint DEFAULT '1' COMMENT '是否禁用',
  `commentNum` int DEFAULT '0' COMMENT '评论的数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=142 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of dynamic
-- ----------------------------
BEGIN;
INSERT INTO `dynamic` (`id`, `userid`, `createtime`, `content`, `mediumaddress`, `type`, `likeNum`, `isdel`, `isabled`, `commentNum`) VALUES (139, 12, '2021-11-17 12:12:30', '第一条😘😘😘😘😘😘😘', '/profile/2021/11/17/11e84a34-bb30-4726-a6cb-383f9c914c01.jpeg', 2, 0, 1, 1, 0);
INSERT INTO `dynamic` (`id`, `userid`, `createtime`, `content`, `mediumaddress`, `type`, `likeNum`, `isdel`, `isabled`, `commentNum`) VALUES (140, 12, '2021-11-17 12:21:27', '第二条😍😍😍😍😍😍', '/profile/2021/11/17/2c0f8e57-f342-4d8b-94e2-ef433009a8f5.jpeg+/profile/2021/11/17/31270e8e-63ec-4a3f-84e1-509e468c70d6.jpeg+/profile/2021/11/17/a5d91394-9e13-49c6-a17d-7f34abaff19c.jpeg+/profile/2021/11/17/8b035e11-3133-420e-85ce-80f981840e7d.jpeg+/profile/2021/11/17/429d794c-6433-4641-ac06-86ffe27786f1.jpeg+/profile/2021/11/17/d6324a20-5bc8-4654-acb8-6e6e14259aa0.jpeg', 2, 0, 1, 1, 3);
INSERT INTO `dynamic` (`id`, `userid`, `createtime`, `content`, `mediumaddress`, `type`, `likeNum`, `isdel`, `isabled`, `commentNum`) VALUES (141, 9, '2022-01-09 06:26:31', 'czxczcz', '/profile/2022/01/09/486dcac5-0eac-4e29-abe1-a402431f6276.jpg+/profile/2022/01/09/ff3848f1-d91c-48a7-be11-290fd4903118.jpeg', 2, -1, 1, 1, 0);
COMMIT;

-- ----------------------------
-- Table structure for find_friend_msg
-- ----------------------------
DROP TABLE IF EXISTS `find_friend_msg`;
CREATE TABLE `find_friend_msg` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称',
  `sex` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `attr` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `type` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `regions` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` tinyint unsigned DEFAULT NULL,
  `sptime` tinyint unsigned DEFAULT NULL,
  `height` double DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `intro` varchar(8000) DEFAULT NULL,
  `other` varchar(7500) DEFAULT NULL,
  `contact` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `isabled` tinyint(1) DEFAULT '1' COMMENT '0为禁止，1为正常',
  `isaudit` tinyint(1) DEFAULT '0' COMMENT '0为未审核，1为审核',
  `province` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `city` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `county` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `userid` int DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16210 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of find_friend_msg
-- ----------------------------
BEGIN;
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (1, '1', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-10-16 03:55:59', 0, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (2, '2', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-02 03:48:22', 0, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (3, '3', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-02 08:04:02', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (4, '4', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-03 07:01:45', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (5, '5', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-03 09:45:46', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (6, '6', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-03 13:50:02', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (7, '7', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-04 03:15:42', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (8, '8', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-05 03:07:47', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (9, '9', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-05 03:17:26', 1, 1, '', '', '', NULL);
INSERT INTO `find_friend_msg` (`id`, `name`, `sex`, `attr`, `status`, `type`, `regions`, `age`, `sptime`, `height`, `weight`, `intro`, `other`, `contact`, `createtime`, `isabled`, `isaudit`, `province`, `city`, `county`, `userid`) VALUES (10, '10', '', '', '', '', '', NULL, NULL, NULL, NULL, '', '', '', '2021-11-05 04:25:45', 1, 1, '', '', '', NULL);
COMMIT;

-- ----------------------------
-- Table structure for follower
-- ----------------------------
DROP TABLE IF EXISTS `follower`;
CREATE TABLE `follower` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int DEFAULT NULL,
  `followerid` int DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `status` int DEFAULT NULL COMMENT '0  是未关注  1是关注',
  `sendmessage` int DEFAULT '1' COMMENT '0 是为生成消息  1是生成消息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of follower
-- ----------------------------
BEGIN;
INSERT INTO `follower` (`id`, `userid`, `followerid`, `createtime`, `status`, `sendmessage`) VALUES (7, 14, 9, '2021-11-22 16:15:49', 1, 1);
INSERT INTO `follower` (`id`, `userid`, `followerid`, `createtime`, `status`, `sendmessage`) VALUES (8, 14, 14, '2021-11-22 20:24:21', 1, 1);
INSERT INTO `follower` (`id`, `userid`, `followerid`, `createtime`, `status`, `sendmessage`) VALUES (9, 9, 14, '2021-11-22 20:26:21', 1, 1);
INSERT INTO `follower` (`id`, `userid`, `followerid`, `createtime`, `status`, `sendmessage`) VALUES (10, 9, 9, '2021-11-22 20:26:23', 1, 1);
COMMIT;

-- ----------------------------
-- Table structure for like_record
-- ----------------------------
DROP TABLE IF EXISTS `like_record`;
CREATE TABLE `like_record` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int DEFAULT NULL,
  `dynamicid` int DEFAULT NULL,
  `status` int DEFAULT NULL COMMENT '用户对这条动态的关注状态   0是未点赞  1是点赞',
  `createtime` datetime DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '点赞类型',
  `sendmessage` int DEFAULT NULL COMMENT '0 是未发消息  1是发消息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of like_record
-- ----------------------------
BEGIN;
INSERT INTO `like_record` (`id`, `userid`, `dynamicid`, `status`, `createtime`, `type`, `sendmessage`) VALUES (1, 9, 140, 1, '2021-11-20 19:07:22', NULL, NULL);
INSERT INTO `like_record` (`id`, `userid`, `dynamicid`, `status`, `createtime`, `type`, `sendmessage`) VALUES (2, 9, 139, 1, '2021-11-20 19:14:14', NULL, NULL);
INSERT INTO `like_record` (`id`, `userid`, `dynamicid`, `status`, `createtime`, `type`, `sendmessage`) VALUES (3, 9, 138, 1, '2021-11-20 19:14:14', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int DEFAULT NULL COMMENT '发布这条消息的id',
  `dynamicid` int DEFAULT NULL,
  `commentid` int DEFAULT NULL,
  `receiverid` int DEFAULT NULL COMMENT '接收此消息的用户id',
  `content` varchar(8000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '通知内容',
  `type` int DEFAULT NULL COMMENT '消息类型',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `isread` int DEFAULT '0' COMMENT '是否已经读了 0 是没有  1是已经读了',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of message
-- ----------------------------
BEGIN;
INSERT INTO `message` (`id`, `userid`, `dynamicid`, `commentid`, `receiverid`, `content`, `type`, `createtime`, `isread`) VALUES (14, 14, 139, NULL, 9, NULL, 1, '2021-11-22 16:03:59', 0);
INSERT INTO `message` (`id`, `userid`, `dynamicid`, `commentid`, `receiverid`, `content`, `type`, `createtime`, `isread`) VALUES (15, 14, 140, NULL, 9, NULL, 1, '2021-11-22 16:04:54', 0);
INSERT INTO `message` (`id`, `userid`, `dynamicid`, `commentid`, `receiverid`, `content`, `type`, `createtime`, `isread`) VALUES (16, 14, NULL, NULL, 9, NULL, 2, '2021-11-22 16:15:49', 1);
INSERT INTO `message` (`id`, `userid`, `dynamicid`, `commentid`, `receiverid`, `content`, `type`, `createtime`, `isread`) VALUES (17, 14, 140, 45, 9, NULL, 0, '2021-11-22 16:18:14', 1);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL COMMENT '账号',
  `nickname` varchar(255) DEFAULT '' COMMENT '昵称',
  `role` int DEFAULT NULL COMMENT '角色',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `isable` tinyint(1) DEFAULT '1' COMMENT '是否禁用  1 为正常  0为禁止',
  `points` int DEFAULT '50' COMMENT '用户积分',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `age` int DEFAULT NULL COMMENT '年龄',
  `height` double DEFAULT NULL COMMENT '身高',
  `weight` double DEFAULT NULL COMMENT '体重',
  `sex` varchar(5) DEFAULT NULL COMMENT '性别',
  `attr` varchar(5) DEFAULT NULL COMMENT '属性',
  `sptime` int DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL COMMENT '身份',
  `regions` varchar(255) DEFAULT NULL COMMENT '地区',
  `signin` int unsigned DEFAULT '0' COMMENT '签到',
  `agreeLocation` int DEFAULT '0' COMMENT '是否同意获取位置  0  为不同意  1为同意',
  `lat` double DEFAULT NULL COMMENT '纬度',
  `lng` double DEFAULT NULL COMMENT '经度',
  `contact` varchar(255) DEFAULT NULL COMMENT '个人联系方式',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `email`, `nickname`, `role`, `avatar`, `password`, `isable`, `points`, `createtime`, `age`, `height`, `weight`, `sex`, `attr`, `sptime`, `status`, `regions`, `signin`, `agreeLocation`, `lat`, `lng`, `contact`) VALUES (1, NULL, '纪念1', NULL, '/profile/2021/11/18/52cfd6fa-309d-49ec-85ca-3032ca8fb40e.jpeg', NULL, 1, 50, NULL, 0, 0, NULL, '男', 'Z', NULL, '学生', '辽宁省', 0, 0, NULL, NULL, NULL);
INSERT INTO `user` (`id`, `email`, `nickname`, `role`, `avatar`, `password`, `isable`, `points`, `createtime`, `age`, `height`, `weight`, `sex`, `attr`, `sptime`, `status`, `regions`, `signin`, `agreeLocation`, `lat`, `lng`, `contact`) VALUES (2, NULL, '纪念2', NULL, '/profile/2021/11/18/52cfd6fa-309d-49ec-85ca-3032ca8fb40e.jpeg', NULL, 1, 50, NULL, 0, 0, NULL, '男', 'Z', NULL, '学生', '辽宁省', 0, 0, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
