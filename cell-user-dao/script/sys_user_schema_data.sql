/*
Navicat MySQL Data Transfer

Source Server         : jeekw
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-03-24 17:10:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_authority`
-- ----------------------------
DROP TABLE IF EXISTS `sys_authority`;
CREATE TABLE `sys_authority` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `organization_id` bigint(20) DEFAULT NULL COMMENT '机构ID',
  `job_id` bigint(20) DEFAULT NULL COMMENT '职务ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `group_id` bigint(20) DEFAULT NULL COMMENT '分组ID',
  `role_ids` varchar(500) DEFAULT NULL COMMENT '角色ID集合',
  `type` tinyint(1) DEFAULT NULL COMMENT '类型(0:user)',
  PRIMARY KEY (`id`),
  KEY `idx_sys_authority_organization` (`organization_id`),
  KEY `idx_sys_authority_job` (`job_id`),
  KEY `idx_sys_authority_user` (`user_id`),
  KEY `idx_sys_authority_group` (`group_id`),
  KEY `idx_sys_authority_type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Records of sys_authority
-- ----------------------------
INSERT INTO `sys_authority` VALUES ('1', '0', '0', '1', '0', '1', '0');
INSERT INTO `sys_authority` VALUES ('2', '0', '0', '2', '0', '2', '0');
INSERT INTO `sys_authority` VALUES ('3', '0', '0', '3', '0', '3', '0');
INSERT INTO `sys_authority` VALUES ('4', '0', '0', '4', '0', '4', '0');
INSERT INTO `sys_authority` VALUES ('5', '0', '0', '5', '0', '5', '0');
INSERT INTO `sys_authority` VALUES ('6', '0', '0', '6', '0', '6', '0');
INSERT INTO `sys_authority` VALUES ('7', '0', '0', '7', '0', '7', '0');
INSERT INTO `sys_authority` VALUES ('8', '0', '0', '8', '0', '8', '0');
INSERT INTO `sys_authority` VALUES ('9', '0', '0', '9', '0', '9', '0');
INSERT INTO `sys_authority` VALUES ('10', '0', '0', '10', '0', '10', '0');

-- ----------------------------
-- Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '权限名称',
  `permission` varchar(100) DEFAULT NULL COMMENT '权限',
  `description` varchar(200) DEFAULT NULL COMMENT '权限描述',
  `display` tinyint(1) DEFAULT NULL COMMENT '是否显示(显示:1,不显示:0)',
  PRIMARY KEY (`id`),
  KEY `idx_sys_permission_name` (`name`),
  KEY `idx_sys_permission_permission` (`permission`),
  KEY `idx_sys_permission_show` (`display`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '所有', '*', '所有操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('2', '新增', 'create', '新增操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('3', '修改', 'update', '修改操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('4', '删除', 'delete', '删除操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('5', '查看', 'query', '查看操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('6', '审核', 'audit', '审核操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('7', '导入', 'import', '导入操作的权限', '1');
INSERT INTO `sys_permission` VALUES ('8', '导出', 'export', '导出操作的权限', '1');

-- ----------------------------
-- Table structure for `sys_resource`
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '资源名称',
  `identity` varchar(100) DEFAULT NULL COMMENT '资源ID(例如:resource 对应Java controller RequestMapping)',
  `url` varchar(200) DEFAULT NULL COMMENT '资源URL(例如:/resource/add  对应Java method RequestMapping)',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父节点(例如:根节点0,parent_id：1)',
  `parent_ids` varchar(200) DEFAULT '' COMMENT '全父节点(例如:根节点0, parent_id:1 parent_ids:0/1)',
  `icon` varchar(200) DEFAULT NULL COMMENT '图标',
  `weight` int(11) DEFAULT NULL COMMENT '排序权重',
  `display` tinyint(1) DEFAULT NULL COMMENT '是否显示(显示:1,不显示:0)',
  PRIMARY KEY (`id`),
  KEY `idx_sys_resource_name` (`name`),
  KEY `idx_sys_resource_identity` (`identity`),
  KEY `idx_sys_resource_user` (`url`),
  KEY `idx_sys_resource_parent_id` (`parent_id`),
  KEY `idx_sys_resource_parent_ids_weight` (`parent_ids`,`weight`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='菜单表';

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '资源', '', '', '0', '0/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('2', '示例管理', 'showcase', '', '1', '0/1/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('3', '示例列表', 'sample', '/showcase/sample', '2', '0/1/2/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('4', '逻辑删除列表', 'deleted', '/showcase/deleted', '2', '0/1/2/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('5', '可移动列表', 'move', '/showcase/move', '2', '0/1/2/', null, '3', '1');
INSERT INTO `sys_resource` VALUES ('6', '文件上传列表', 'upload', '/showcase/upload', '2', '0/1/2/', null, '4', '1');
INSERT INTO `sys_resource` VALUES ('7', '树列表', 'tree', '/showcase/tree', '2', '0/1/2/', null, '5', '1');
INSERT INTO `sys_resource` VALUES ('8', '编辑器列表', 'editor', '/showcase/editor', '2', '0/1/2/', null, '6', '1');
INSERT INTO `sys_resource` VALUES ('9', '父子表（小数据量）', 'parentchild', '/showcase/parentchild/parent', '2', '0/1/2/', null, '7', '1');
INSERT INTO `sys_resource` VALUES ('10', '父子表（大数据量）管理', '', '', '2', '0/1/2/', null, '8', '1');
INSERT INTO `sys_resource` VALUES ('11', '类别列表', 'productCategory', '/showcase/product/category', '10', '0/1/2/10/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('12', '产品列表', 'product', '/showcase/product/product', '10', '0/1/2/10/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('13', '状态管理', '', '', '2', '0/1/2/', null, '9', '1');
INSERT INTO `sys_resource` VALUES ('14', '审核状态列表', 'statusAudit', '/showcase/status/audit', '13', '0/1/2/13/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('15', '显示状态列表', 'statusShow', '/showcase/status/show', '13', '0/1/2/13/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('16', '系统管理', 'sys', '', '1', '0/1/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('17', '用户管理', '', '', '16', '0/1/16/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('18', '用户列表', 'user', '/admin/sys/user/main', '17', '0/1/16/17/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('19', '在线用户列表', 'userOnline', '/admin/sys/user/online', '17', '0/1/16/17/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('20', '状态变更历史列表', 'userStatusHistory', '/admin/sys/user/statusHistory', '17', '0/1/16/17/', null, '3', '1');
INSERT INTO `sys_resource` VALUES ('21', '用户最后在线历史列表', 'userLastOnline', '/admin/sys/user/lastOnline', '17', '0/1/16/17/', null, '4', '1');
INSERT INTO `sys_resource` VALUES ('22', '组织机构管理', '', '', '16', '0/1/16/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('23', '组织机构列表', 'organization', '/admin/sys/organization/organization', '22', '0/1/16/22/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('24', '工作职务列表', 'job', '/admin/sys/organization/job', '22', '0/1/16/22/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('25', '资源列表', 'resource', '/admin/sys/resource', '16', '0/1/16/', null, '4', '1');
INSERT INTO `sys_resource` VALUES ('26', '权限管理', '', '', '16', '0/1/16/', null, '5', '1');
INSERT INTO `sys_resource` VALUES ('27', '权限列表', 'permission', '/admin/sys/permission/permission', '26', '0/1/16/26/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('28', '授权权限给角色', 'role', '/admin/sys/permission/role', '26', '0/1/16/26/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('29', '分组列表', 'group', '/admin/sys/group', '16', '0/1/16/', null, '3', '1');
INSERT INTO `sys_resource` VALUES ('30', '授权角色给实体', 'auth', '/admin/sys/auth', '26', '0/1/16/26/', null, '3', '1');
INSERT INTO `sys_resource` VALUES ('31', '个人中心', '', '', '1', '0/1/', null, '4', '1');
INSERT INTO `sys_resource` VALUES ('32', '我的消息', '', '/admin/personal/message', '31', '0/1/31/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('33', '开发维护', 'maintain', '', '1', '0/1/', null, '5', '1');
INSERT INTO `sys_resource` VALUES ('34', '图标管理', 'icon', '/admin/maintain/icon', '33', '0/1/33/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('35', '键值对', 'keyvalue', '/admin/maintain/keyvalue', '33', '0/1/33/', null, '3', '1');
INSERT INTO `sys_resource` VALUES ('37', '静态资源版本控制', 'staticResource', '/admin/maintain/staticResource', '33', '0/1/33/', null, '4', '1');
INSERT INTO `sys_resource` VALUES ('38', '在线编辑', 'onlineEditor', '/admin/maintain/editor', '33', '0/1/33/', null, '5', '1');
INSERT INTO `sys_resource` VALUES ('39', '系统监控', 'monitor', '', '1', '0/1/', null, '6', '1');
INSERT INTO `sys_resource` VALUES ('40', '在线用户列表', 'userOnline', '/admin/sys/user/online', '39', '0/1/39/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('41', '数据库监控', 'db', '/admin/monitor/druid/index.html', '39', '0/1/39/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('42', 'hibernate监控', 'hibernate', '/admin/monitor/hibernate', '39', '0/1/39/', null, '3', '1');
INSERT INTO `sys_resource` VALUES ('43', '执行SQL/JPA QL', 'ql', '/admin/monitor/db/sql', '39', '0/1/39/', null, '4', '1');
INSERT INTO `sys_resource` VALUES ('44', 'ehcache监控', 'ehcache', '/admin/monitor/ehcache', '39', '0/1/39/', null, '5', '1');
INSERT INTO `sys_resource` VALUES ('45', 'jvm监控', 'jvm', '/admin/monitor/jvm', '39', '0/1/39/', null, '6', '1');
INSERT INTO `sys_resource` VALUES ('46', 'Excel导入/导出', 'excel', '/showcase/excel', '2', '0/1/2/', null, '10', '1');
INSERT INTO `sys_resource` VALUES ('47', '我的通知', '', '/admin/personal/notification', '31', '0/1/31/', null, '2', '1');
INSERT INTO `sys_resource` VALUES ('48', '通知模板', 'notificationTemplate', '/admin/maintain/notification/template', '33', '0/1/33/', null, '1', '1');
INSERT INTO `sys_resource` VALUES ('49', '任务调度', 'dynamicTask', '/admin/maintain/dynamicTask', '33', '0/1/33/', null, '6', '1');

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `role` varchar(100) DEFAULT NULL COMMENT '角色英文',
  `description` varchar(200) DEFAULT NULL COMMENT '角色描述',
  `display` tinyint(1) DEFAULT NULL COMMENT '是否显示(显示:1,不显示:0)',
  PRIMARY KEY (`id`),
  KEY `idx_sys_role_name` (`name`),
  KEY `idx_sys_role_role` (`role`),
  KEY `idx_sys_role_display` (`display`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '超级管理员', 'admin', '拥有所有权限', '1');
INSERT INTO `sys_role` VALUES ('2', '示例管理员', 'example_admin', '拥有示例管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('3', '系统管理员', 'sys_admin', '拥有系统管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('4', '维护管理员', 'conf_admin', '拥有维护管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('5', '新增管理员', 'create_admin', '拥有新增/查看管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('6', '修改管理员', 'update_admin', '拥有修改/查看管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('7', '删除管理员', 'delete_admin', '拥有删除/查看管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('8', '查看管理员', 'view_admin', '拥有查看管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('9', '审核管理员', 'audit_admin', '拥有审核管理的所有权限', '1');
INSERT INTO `sys_role` VALUES ('10', '监控管理员', 'audit_admin', '拥有审核管理的所有权限', '1');

-- ----------------------------
-- Table structure for `sys_role_resource_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource_permission`;
CREATE TABLE `sys_role_resource_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `resource_id` bigint(20) DEFAULT NULL COMMENT '资源ID',
  `permission_ids` varchar(500) DEFAULT NULL COMMENT '权限ID集合',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_sys_role_resource_permission` (`role_id`,`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='角色菜单权限关联表';

-- ----------------------------
-- Records of sys_role_resource_permission
-- ----------------------------
INSERT INTO `sys_role_resource_permission` VALUES ('1', '1', '2', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('2', '1', '16', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('3', '1', '33', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('4', '1', '39', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('5', '2', '2', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('6', '3', '16', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('7', '4', '33', '1');
INSERT INTO `sys_role_resource_permission` VALUES ('8', '5', '2', '2,5');
INSERT INTO `sys_role_resource_permission` VALUES ('9', '5', '16', '2,5');
INSERT INTO `sys_role_resource_permission` VALUES ('10', '5', '33', '2,5');
INSERT INTO `sys_role_resource_permission` VALUES ('11', '5', '39', '2,5');
INSERT INTO `sys_role_resource_permission` VALUES ('12', '6', '2', '3,5');
INSERT INTO `sys_role_resource_permission` VALUES ('13', '6', '16', '3,5');
INSERT INTO `sys_role_resource_permission` VALUES ('14', '6', '33', '3,5');
INSERT INTO `sys_role_resource_permission` VALUES ('15', '6', '39', '3,5');
INSERT INTO `sys_role_resource_permission` VALUES ('16', '7', '2', '4,5');
INSERT INTO `sys_role_resource_permission` VALUES ('17', '7', '16', '4,5');
INSERT INTO `sys_role_resource_permission` VALUES ('18', '7', '33', '4,5');
INSERT INTO `sys_role_resource_permission` VALUES ('19', '7', '39', '4,5');
INSERT INTO `sys_role_resource_permission` VALUES ('20', '8', '2', '5');
INSERT INTO `sys_role_resource_permission` VALUES ('21', '8', '16', '5');
INSERT INTO `sys_role_resource_permission` VALUES ('22', '8', '33', '5');
INSERT INTO `sys_role_resource_permission` VALUES ('23', '8', '39', '5');
INSERT INTO `sys_role_resource_permission` VALUES ('24', '9', '7', '5,6');
INSERT INTO `sys_role_resource_permission` VALUES ('25', '9', '14', '5,6');
INSERT INTO `sys_role_resource_permission` VALUES ('26', '9', '15', '5,6');
INSERT INTO `sys_role_resource_permission` VALUES ('27', '10', '39', '1');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL COMMENT '姓名',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salt` varchar(10) DEFAULT NULL COMMENT '加密盐',
  `device` varchar(20) DEFAULT NULL COMMENT '终端(安卓: 1 IOS:2  Web:0 )',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态(正常:0,锁定:1)',
  `deleted` tinyint(1) DEFAULT NULL COMMENT '是否有效(0:有效,1:无效)',
  `admin` tinyint(1) DEFAULT NULL COMMENT '是否管理员(0:非管理员,1:管理员)',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间(格式:yyyy-MM-dd HH:mm:ss)',
  `created_by` varchar(36) NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_sys_user_username` (`username`),
  UNIQUE KEY `unique_sys_user_email` (`email`),
  UNIQUE KEY `unique_sys_user_mobile` (`mobile`),
  KEY `idx_sys_user_status` (`status`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'admin@sishuok.com', '13412345671', 'ec21fa1738f39d5312c6df46002d403d', 'yDd1956wn1', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('2', 'showcase', 'showcase@sishuok.com', '13412345672', '5f915c55c6d43da136a42e3ebabbecfc', 'hSSixwNQwt', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('3', 'sys', 'sys@sishuok.com', '13412345673', 'a10b3c7af051a81fe2506318f982ce28', 'MANHOoCpnb', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('4', 'maintain', 'maintain@sishuok.com', '13412345674', '594813c5eb02b210dacc1a36c2482fc1', 'iY71e4dtoa', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('5', 'create', 'create@sishuok.com', '13412345675', 'a6d5988a698dec63c6eea71994dd7be0', 'iruPxupgfb', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('6', 'update', 'update@sishuok.com', '13412345676', 'fffa26ac5c47ec1bf9a37d9823816074', '2WQx5LmvlV', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('7', 'delete', 'delete@sishuok.com', '13412345677', '4c472bf1d56f440d2953803ab4eea8d4', 'E8KSvr1C7d', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('8', 'view', 'view@sishuok.com', '13412345678', 'c919215efcef4064858bf02f8776c00d', 'XFJZQOXWZW', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('9', 'audit', 'audit@sishuok.com', '13412345679', '15d8f7b8da8045d24c71a92a142ffad7', 'BI2XbXMUr7', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
INSERT INTO `sys_user` VALUES ('10', 'monitor', 'monitor@sishuok.com', '1341234580', 'e1549e68ad21fe888ae36ec4965116cd', 'iY71e4d123', '0', '0', '0', '1', '2017-03-24 12:13:04', 'admin');
