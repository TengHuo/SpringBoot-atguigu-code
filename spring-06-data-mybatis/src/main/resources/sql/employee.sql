/*
Source Server         : 192.168.0.51
Source Database       : mybatis
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id`       INT(11) NOT NULL AUTO_INCREMENT,
  `lastName` VARCHAR(255)     DEFAULT NULL,
  `email`    VARCHAR(255)     DEFAULT NULL,
  `gender`   INT(2)           DEFAULT NULL,
  `d_id`     INT(11)          DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;
