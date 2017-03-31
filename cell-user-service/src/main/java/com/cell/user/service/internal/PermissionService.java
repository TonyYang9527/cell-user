package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysAuthority;
import com.cell.user.dao.entiy.SysPermission;
import com.cell.user.dao.mapper.SysPermissionMapper;
import com.cell.user.ifacade.request.authority.CreateSysAuthorityReq;
import com.google.common.base.Joiner;

@Service("permissionService")
public class PermissionService {

	private Logger logger = LoggerFactory.getLogger(PermissionService.class);

	@Resource
	protected SysPermissionMapper sysPermissionMapper;

	/**
	 * 根据主键获取SysPermission.
	 *
	 * @param id
	 *            the id
	 * @return SysPermission
	 */
	public SysPermission getSysPermissionById(Long id) {
		SysPermission permission = sysPermissionMapper.selectByPrimaryKey(id);
		logger.info("getSysAuthorityById  id:{},authority:{}",
				JSON.toJSONString(id), JSON.toJSONString(permission));
		if (permission != null) {
			return permission;
		}
		return null;
	}

	/**
	 * 创建 SysPermission.
	 * 
	 * @param vo
	 * @return id
	 */
	public Long createSysPermission(CreateSysAuthorityReq req) {

		SysPermission permission = new SysPermission();
		sysPermissionMapper.insertSelective(permission);
		logger.info("createSysAuthority  authority:{}",
				JSON.toJSONString(permission));
		// 后面加入缓存
		return permission.getId();
	}

}
