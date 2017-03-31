package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysRole;
import com.cell.user.dao.mapper.SysRoleMapper;
import com.cell.user.ifacade.request.role.CreateSysRoleReq;

@Service("roleService")
public class RoleService {

	private Logger logger = LoggerFactory.getLogger(RoleService.class);

	@Resource
	protected SysRoleMapper sysRoleMapper;

	/**
	 * 根据主键获取SysRole.
	 *
	 * @param id
	 *            the id
	 * @return SysRole
	 */
	public SysRole getSysRoleById(Long id) {
		SysRole role = sysRoleMapper.selectByPrimaryKey(id);
		logger.info("getSysRoleById  id:{},role:{}", JSON.toJSONString(id),
				JSON.toJSONString(role));
		if (role != null) {
			return role;
		}
		return null;
	}

	/**
	 * 创建 SysRole.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysRole(CreateSysRoleReq req) {

		SysRole role = new SysRole();
		role.setName(req.getName());
		role.setRole(req.getRole());
		role.setDisplay(req.getDisplay());
		role.setDescription(req.getDescription());
		sysRoleMapper.insertSelective(role);
		logger.info("createSysRole  role:{}", JSON.toJSONString(role));
		// 后面加入缓存
		return role.getId();
	}

}
