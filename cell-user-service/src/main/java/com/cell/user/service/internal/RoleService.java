package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysRole;
import com.cell.user.dao.mapper.SysRoleMapper;

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

}
