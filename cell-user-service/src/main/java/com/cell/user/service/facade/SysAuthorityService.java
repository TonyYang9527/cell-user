package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cell.user.dao.mapper.RoleMapper;
import com.cell.user.dao.mapper.SysAuthorityMapper;
import com.cell.user.ifacade.facade.SysAuthorityFacade;
import com.cell.user.ifacade.request.authority.CreateSysAuthorityReq;
import com.cell.user.ifacade.request.authority.DeleteSysAuthorityReq;
import com.cell.user.ifacade.request.authority.GetSysAuthorityReq;
import com.cell.user.ifacade.request.authority.ListSysAuthorityReq;
import com.cell.user.ifacade.request.authority.UpdateSysAuthorityReq;
import com.cell.user.ifacade.response.authority.CreateSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.DeleteSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.GetSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.ListSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.UpdateSysAuthorityRsp;

@Service("sysAuthorityService")
public class SysAuthorityService implements SysAuthorityFacade {


    private Logger logger = LoggerFactory.getLogger(SysAuthorityService.class);

    @Resource
    protected SysAuthorityMapper sysAuthorityMapper;
    
	@Override
	public CreateSysAuthorityRsp createSysAuthority(CreateSysAuthorityReq req) {

		return null;
	}

	@Override
	public UpdateSysAuthorityRsp updateSysAuthority(UpdateSysAuthorityReq req) {

		return null;
	}

	@Override
	public DeleteSysAuthorityRsp deleteSysAuthority(DeleteSysAuthorityReq req) {

		return null;
	}

	@Override
	public ListSysAuthorityRsp listSysAuthority(ListSysAuthorityReq req) {

		return null;
	}

	@Override
	public GetSysAuthorityRsp getSysAuthority(GetSysAuthorityReq req) {

		return null;
	}

}
