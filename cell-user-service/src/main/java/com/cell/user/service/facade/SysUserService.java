package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.dao.mapper.SysRoleMapper;
import com.cell.user.dao.mapper.SysUserMapper;
import com.cell.user.ifacade.facade.SysUserFacade;
import com.cell.user.ifacade.request.user.ChangeAdminSysUserReq;
import com.cell.user.ifacade.request.user.ChangeDeletedSysUserReq;
import com.cell.user.ifacade.request.user.ChangeStatusUserReq;
import com.cell.user.ifacade.request.user.CheckSysUserReq;
import com.cell.user.ifacade.request.user.CreateSysUserReq;
import com.cell.user.ifacade.request.user.GetSysUserReq;
import com.cell.user.ifacade.request.user.ListSysUserReq;
import com.cell.user.ifacade.request.user.UpdateSysUserReq;
import com.cell.user.ifacade.response.user.ChangeAdminSysUserRsp;
import com.cell.user.ifacade.response.user.ChangeDeletedSysUserRsp;
import com.cell.user.ifacade.response.user.ChangeStatusSysUserRsp;
import com.cell.user.ifacade.response.user.CheckSysUserRsp;
import com.cell.user.ifacade.response.user.CreateSysUserRsp;
import com.cell.user.ifacade.response.user.DeleteSysUserRsp;
import com.cell.user.ifacade.response.user.GetSysUserRsp;
import com.cell.user.ifacade.response.user.ListSysUserRsp;
import com.cell.user.ifacade.response.user.UpdateSysUserRsp;

@Service("sysUserService")
public class SysUserService implements SysUserFacade {

	private Logger logger = LoggerFactory.getLogger(SysUserService.class);
	
	@Resource
	protected  SysUserMapper sysUserMapper;
	
	@Override
	public CreateSysUserRsp createSysUser(CreateSysUserReq req) {
		
		return null;
	}

	@Override
	public UpdateSysUserRsp updateSysUser(UpdateSysUserReq req) {
		
		return null;
	}

	@Override
	public DeleteSysUserRsp deleteSysUser(DeleteSysUserRsp req) {
		
		return null;
	}

	@Override
	public ListSysUserRsp listSysUser(ListSysUserReq req) {
		
		return null;
	}

	@Override
	public GetSysUserRsp getSysUser(GetSysUserReq req) {
		
		return null;
	}

	@Override
	public ChangeDeletedSysUserRsp changeDeletedSysUser(
			ChangeDeletedSysUserReq req) {
		
		return null;
	}

	@Override
	public ChangeStatusSysUserRsp changeStatusSysUser(ChangeStatusUserReq req) {
		
		return null;
	}

	@Override
	public ChangeAdminSysUserRsp changeAdminSysUser(ChangeAdminSysUserReq req) {
		
		return null;
	}

	@Override
	public CheckSysUserRsp checkSysUser(CheckSysUserReq req) {
		
		return null;
	}

}
