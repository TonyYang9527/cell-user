package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.dao.mapper.SysRoleMapper;
import com.cell.user.ifacade.facade.SysRoleFacade;
import com.cell.user.ifacade.request.role.CreateSysRoleReq;
import com.cell.user.ifacade.request.role.DeleteSysRoleRsp;
import com.cell.user.ifacade.request.role.GetSysRoleReq;
import com.cell.user.ifacade.request.role.ListSysRoleReq;
import com.cell.user.ifacade.request.role.UpdateSysRoleReq;
import com.cell.user.ifacade.response.role.CreateSysRoleRsp;
import com.cell.user.ifacade.response.role.GetSysRoleRsp;
import com.cell.user.ifacade.response.role.ListSysRoleRsp;
import com.cell.user.ifacade.response.role.UpdateSysRoleRsp;

@Service("sysRoleService")
public class SysRoleService implements SysRoleFacade {

	private Logger logger = LoggerFactory.getLogger(SysRoleService.class);

	@Resource
	protected SysRoleMapper sysRoleMapper;

	@Override
	public CreateSysRoleRsp createSysRole(CreateSysRoleReq req) {

		return null;
	}

	@Override
	public UpdateSysRoleRsp updateSysRole(UpdateSysRoleReq req) {
		return null;
	}

	@Override
	public DeleteSysRoleRsp deleteSysRole(DeleteSysRoleRsp req) {

		return null;
	}

	@Override
	public ListSysRoleRsp listSysRole(ListSysRoleReq req) {

		return null;
	}

	@Override
	public GetSysRoleRsp getSysRole(GetSysRoleReq req) {

		return null;
	}

}
