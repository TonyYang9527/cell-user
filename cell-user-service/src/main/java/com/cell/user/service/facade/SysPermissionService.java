package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.dao.mapper.SysPermissionMapper;
import com.cell.user.ifacade.facade.SysPermissionFacade;
import com.cell.user.ifacade.request.permission.CreateSysPermissionReq;
import com.cell.user.ifacade.request.permission.DeleteSysPermissionRsp;
import com.cell.user.ifacade.request.permission.GetSysPermissionReq;
import com.cell.user.ifacade.request.permission.ListSysPermissionReq;
import com.cell.user.ifacade.request.permission.UpdateSysPermissionReq;
import com.cell.user.ifacade.response.permission.CreateSysPermissionRsp;
import com.cell.user.ifacade.response.permission.GetSysPermissionRsp;
import com.cell.user.ifacade.response.permission.ListSysPermissionRsp;
import com.cell.user.ifacade.response.permission.UpdateSysPermissionRsp;

@Service("sysPermissionService")
public class SysPermissionService implements SysPermissionFacade {

	private Logger logger = LoggerFactory.getLogger(SysPermissionService.class);

	@Resource
	protected SysPermissionMapper sysPermissionMapper;

	@Override
	public CreateSysPermissionRsp createSysPermission(CreateSysPermissionReq req) {

		return null;
	}

	@Override
	public UpdateSysPermissionRsp updateSysPermission(UpdateSysPermissionReq req) {

		return null;
	}

	@Override
	public DeleteSysPermissionRsp deleteSysPermission(DeleteSysPermissionRsp req) {

		return null;
	}

	@Override
	public ListSysPermissionRsp listSysPermission(ListSysPermissionReq req) {

		return null;
	}

	@Override
	public GetSysPermissionRsp getSysPermission(GetSysPermissionReq req) {

		return null;
	}

}
