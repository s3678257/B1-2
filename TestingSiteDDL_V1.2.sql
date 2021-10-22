/*
 Navicat Premium Data Transfer

 Source Server         : 123
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : bb霜

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 22/10/2021 14:18:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for testing sites
-- ----------------------------
DROP TABLE IF EXISTS `testingsite`;
CREATE TABLE `testingsite`  (
  `Suburb` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
  `Location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Waiting_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Distance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Num_people` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `OpeningHour` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `SiteType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PhoneNum` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Limitation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of testing sites
-- ----------------------------
INSERT INTO `testingsite` VALUES ('Albert Park', 'Aughtie Walk，51-55 Dundas Pl, Albert Park VIC 3206', '40 Minutes', '0.75', '8', '08:00-19:30(Monday-Thursday)\r\n08:00-17:00(Friday)\r\n09:30-12:30(Saturday)', 'Walk-in clinic', '+61 3 9699 8044', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Balaclava', 'Melbourne Pathology\r\n287B Carlisle St, Balaclava VIC 3183', '50 Minutes', '0.82', '10', '08:00-16:00(Monday-Friday)\r\n08:00–13:00\r\n13:30–17:00(Monday-Friday)\r\n07:30-12:30(Saturday-Sunday)', 'Walk-in clinic', '+61 3 95279699', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Collingwood', 'Cohealth\r\n365 Hoddle St, Collingwood VIC 3066', '20 Minutes', '12', '4', '08:00–13:00\r\n13:30–17:00(Monday-Friday)\r\n08:00-17:00(Monday-Friday)\r\n09:00-12:00(Saturday)\r\nclose(Sunday)', 'GP Respiratory clinic', '+61 3 9448 5528', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Fairfield', '4Cyte Pathology\r\n202 Station St, Fairfield VIC 3078', '60 Minutes', '30.9', '12', '08:00-17:00(Monday-Friday)\r\n09:00-12:00(Saturday)\r\nclose(Sunday)', 'Drive-through clinic', '+61 434 991 642', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Melbourne CBD', '4Cyte Pathology\r\n231 Russell St, Melbourne VIC 3000', '30 Minutes', '14', '6', '09:00-13:00(Saturday-Sunday)', 'Walk-in clinic', '+61 434 888 775', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Melbourne CBD', 'Bourke Street Melbourne\r\n231 Victoria Rd, Melbourne VIC 3078', '90 Minutes', '12', '16', '08:00-16:00(Monday-Friday)\r\n07:00-19:00(Monday-Friday)\r\n08:00-16:00(Saturday-Sunday)', 'Walk-in clinic', 'not available', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Moonee Ponds', 'Melbourne Pathology\r\n45A Hall St, Moonee Ponds VIC 3039', '10 Minutes', '15', '2', '07:00-19:00(Monday-Friday)\r\nclose(Sunday)', 'Walk-in clinic', '+61 3 9370 4946', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('North Melbourne', 'Melbourne Pathology\r\n70 Alfred St, North Melbourne VIC 3051', '60 Minutes', '35.6', '12', 'close(Saturday-Sunday)', 'Drive-through clinic', '+61 3 9287 7700', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Port Melbourne', 'Port Melbourne Respiratory Clinic\r\nshop 1/405 Bay St, Port Melbourne VIC 3207', '40 Minutes', '22.3', '8', '08:30-16:30(Monday-Friday)\r\n09:30-12:30(Saturday)', 'GP Respiratory clinic', '+61 3 8686 0500', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Prahran', 'Prahran Respiratory Clinic\r\n240 Malvern Rd, Prahran VIC 3181', '30 Minutes', '0.55', '6', 'close(Saturday-Sunday)', 'GP Respiratory clinic', '+61 3 9525 1300', 'Opening', 'All ages');
INSERT INTO `testingsite` VALUES ('South Melbourne', 'Montague Street\r\nSouth Melbourne VIC 3205', '50 Minutes', '23', '10', 'not available', 'not available', 'not available', 'not available', 'not available');
INSERT INTO `testingsite` VALUES ('West Footscray', 'Cohealth\r\n78 Paisley St, Footscray VIC 3011', '20 Minutes', '17', '4', '08:30-17:30(Monday,Wednesday)\r\n08:30-20:00(Tuesday,Thursday)\r\n09:00-13:00(Saturday)\r\nclose(Sunday)', 'Walk-in clinic', '+61 3 9448 5502', 'opening', 'All ages');
INSERT INTO `testingsite` VALUES ('Altona', 'Altona North Respiratory Clinic\r\nREAR OF, 6/230 Blackshaws Rd, Altona North VIC 3025', '30 Minutes', '19', '6', '08:30-17:30(Monday,Wednesday)\r\n08:30-20:00(Tuesday,Thursday)\r\n09:00-13:00(Saturday)\r\n08:00-16:00(Monday-Friday)\r\nclose(Saturday-Sunday)', 'GP Respiratory clinic', '+61 3 9393 3977', 'Opening', 'All ages');


