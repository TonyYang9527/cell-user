package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysRoleResourcePermission;
import com.cell.user.dao.mapper.SysRoleResourcePermissionMapper;
import com.cell.user.ifacade.request.relation.CreateRoleResourcePermissionReq;
import com.google.common.base.Joiner;

@Service("roleResourcePermissionService")
public class RoleResourcePermissionService {

	private Logger logger = LoggerFactory
			.getLogger(RoleResourcePermissionService.class);

	@Resource
	protected SysRoleResourcePermissionMapper sysRoleResourcePermissionMapper;

	/**
	 * 根据主键获取SysRoleResourcePermission.
	 *
	 * @param id
	 *            the id
	 * @return SysRoleResourcePermission
	 */
	public SysRoleResourcePermission getSysRoleResourcePermissionById(Long id) {
		SysRoleResourcePermission relation = sysRoleResourcePermissionMapper
				.selectByPrimaryKey(id);
		logger.info("getSysRoleResourcePermissionById  id:{},relation:{}",
				JSON.toJSONString(id), JSON.toJSONString(relation));
		if (relation != null) {
			return relation;
		}
		return null;
	}

	/**
	 * 创建 SysPermission.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysRoleResourcePermission(
			CreateRoleResourcePermissionReq req) {

		SysRoleResourcePermission relation = new SysRoleResourcePermission();
		relation.setRoleId(req.getRoleId());
		relation.setResourceId(req.getResourceId());
		relation.setPermissionIds(Joiner.on(",").join(req.getPermissionIds()));
		sysRoleResourcePermissionMapper.insertSelective(relation);
		logger.info("createSysRoleResourcePermission  relation:{}",
				JSON.toJSONString(relation));
		// 后面加入缓存
		return relation.getId();
	}
}
