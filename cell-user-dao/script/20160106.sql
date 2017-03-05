
-- ----------------------------
-- Table structure for `role`
-- ----------------------------
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` varchar(50) NOT NULL COMMENT '客户ID',
  `name` varchar(50) NOT NULL COMMENT '名字',
  `description` varchar(50) DEFAULT NULL COMMENT '活动描述',
  `state` tinyint(4) NOT NULL COMMENT '状态',
  `type` tinyint(4) NOT NULL COMMENT '类型',
  `created_time` datetime NOT NULL,
  `created_by` varchar(36) NOT NULL,
  `updated_time` datetime DEFAULT NULL,
  `updated_by` varchar(36) DEFAULT NULL,
  `deleted_time` datetime DEFAULT NULL,
  `deleted_by` varchar(36) DEFAULT NULL,
  `deleted` tinyint(1) NOT NULL DEFAULT '0',
  `DataChange_LastTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- ----------------------------
-- Records of role
-- ----------------------------
