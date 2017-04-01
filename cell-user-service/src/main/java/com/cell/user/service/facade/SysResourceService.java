package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.dao.mapper.SysResourceMapper;
import com.cell.user.ifacade.facade.SysResourceFacade;
import com.cell.user.ifacade.request.resource.CreateSysResourceReq;
import com.cell.user.ifacade.request.resource.DeleteSysResourceRsp;
import com.cell.user.ifacade.request.resource.GetSysResourceReq;
import com.cell.user.ifacade.request.resource.ListSysResourceReq;
import com.cell.user.ifacade.request.resource.UpdateSysResourceReq;
import com.cell.user.ifacade.response.resource.CreateSysResourceRsp;
import com.cell.user.ifacade.response.resource.GetSysResourceRsp;
import com.cell.user.ifacade.response.resource.ListSysResourceRsp;
import com.cell.user.ifacade.response.resource.UpdateSysResourceRsp;

@Service("sysResourceService")
public class SysResourceService implements SysResourceFacade {

	private Logger logger = LoggerFactory.getLogger(SysResourceService.class);

	@Resource
	protected SysResourceMapper sysResourceMapper;

	@Override
	public CreateSysResourceRsp createSysResource(CreateSysResourceReq req) {

		return null;
	}

	@Override
	public UpdateSysResourceRsp updateSysResource(UpdateSysResourceReq req) {

		return null;
	}

	@Override
	public DeleteSysResourceRsp deleteSysResource(DeleteSysResourceRsp req) {

		return null;
	}

	@Override
	public ListSysResourceRsp listSysResource(ListSysResourceReq req) {

		return null;
	}

	@Override
	public GetSysResourceRsp getSysResource(GetSysResourceReq req) {

		return null;
	}

}
