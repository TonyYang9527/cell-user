package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.dao.mapper.SysResourceMapper;
import com.cell.user.dao.mapper.SysRoleResourcePermissionMapper;
import com.cell.user.ifacade.facade.SysRoleResourcePermissionFacade;
import com.cell.user.ifacade.request.relation.CreateRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.DeleteRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.GetRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.ListRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.UpdateRoleResourcePermissionReq;
import com.cell.user.ifacade.response.relation.CreateRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.DeleteRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.GetRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.ListRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.UpdateRoleResourcePermissionRsp;

@Service("sysRoleResourcePermissionService")
public class SysRoleResourcePermissionService implements
		SysRoleResourcePermissionFacade {

	private Logger logger = LoggerFactory.getLogger(SysRoleResourcePermissionService.class);
	
	@Resource
	protected SysRoleResourcePermissionMapper sysRoleResourcePermissionMapper;
	@Override
	public CreateRoleResourcePermissionRsp createRoleResourcePermission(
			CreateRoleResourcePermissionReq req) {
		
		return null;
	}

	@Override
	public UpdateRoleResourcePermissionRsp updateRoleResourcePermission(
			UpdateRoleResourcePermissionReq req) {
		
		return null;
	}

	@Override
	public DeleteRoleResourcePermissionRsp deleteRoleResourcePermission(
			DeleteRoleResourcePermissionReq req) {
		
		return null;
	}

	@Override
	public ListRoleResourcePermissionRsp listRoleResourcePermission(
			ListRoleResourcePermissionReq req) {
		
		return null;
	}

	@Override
	public GetRoleResourcePermissionRsp getRoleResourcePermission(
			GetRoleResourcePermissionReq req) {
		
		return null;
	}

}
