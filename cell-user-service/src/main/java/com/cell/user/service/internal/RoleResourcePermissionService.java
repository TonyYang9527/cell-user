package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysRoleResourcePermission;
import com.cell.user.dao.entiy.SysRoleResourcePermissionExample;
import com.cell.user.dao.mapper.SysRoleResourcePermissionMapper;
import com.cell.user.ifacade.request.relation.CreateRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.UpdateRoleResourcePermissionReq;
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
	 * 创建 SysRoleResourcePermission.
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
	
	
	/**
	 * 更新 SysRoleResourcePermission
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean updateSysRoleResourcePermission(UpdateRoleResourcePermissionReq req) {

		SysRoleResourcePermission relation = new SysRoleResourcePermission();
		relation.setRoleId(req.getRoleId());
		relation.setResourceId(req.getResourceId());
		relation.setPermissionIds(Joiner.on(",").join(req.getPermissionIds()));

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(req.getId());

		logger.info("updateSysRoleResourcePermission  relation:{}",
				JSON.toJSONString(relation));
		sysRoleResourcePermissionMapper.updateByExampleSelective(relation, example);

		return true;
	}
	
	

	
	/**
	 * 根据id 删除 SysRoleResourcePermission.
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean deleteSysRoleResourcePermissionById(Long id) {

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		logger.info("deleteSysRoleResourcePermissionById  id:{}",
				JSON.toJSONString(id));
		sysRoleResourcePermissionMapper.deleteByExample(example);
		return true;
	}
}
