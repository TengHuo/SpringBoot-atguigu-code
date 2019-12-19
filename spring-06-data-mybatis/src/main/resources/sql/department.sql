/*
Source Server         : 192.168.0.51
Source Database       : mybatis
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id`             INT(11) NOT NULL AUTO_INCREMENT,
  `department_name` VARCHAR(255)     DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

INSERT INTO `department` (department_name) VALUES ('AA');
INSERT INTO `department` (department_name) VALUES ('BB');

