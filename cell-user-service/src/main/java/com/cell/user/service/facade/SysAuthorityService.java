package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysAuthority;
import com.cell.user.dao.entiy.SysAuthorityExample;
import com.cell.user.dao.entiy.SysAuthorityExample.Criteria;
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

		CreateSysAuthorityRsp rsp = new CreateSysAuthorityRsp();

		SysAuthority record = new SysAuthority();
		int id = sysAuthorityMapper.insertSelective(record);
		rsp.setId(id);
		rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
		rsp.setRetMsg(Constants.SUCCESS);
		logger.info("req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateSysAuthorityRsp updateSysAuthority(UpdateSysAuthorityReq req) {

		UpdateSysAuthorityRsp rsp = new UpdateSysAuthorityRsp();

		SysAuthority record = new SysAuthority();

		SysAuthorityExample example = new SysAuthorityExample();
		Criteria criteria = example.createCriteria();
		Long id = null;
		criteria.andIdEqualTo(id);

		int count = sysAuthorityMapper.updateByExample(record, example);

		logger.info("req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteSysAuthorityRsp deleteSysAuthority(DeleteSysAuthorityReq req) {

		DeleteSysAuthorityRsp rsp = new DeleteSysAuthorityRsp();

		return rsp;
	}

	@Override
	public ListSysAuthorityRsp listSysAuthority(ListSysAuthorityReq req) {

		ListSysAuthorityRsp rsp = new ListSysAuthorityRsp();

		return rsp;
	}

	@Override
	public GetSysAuthorityRsp getSysAuthority(GetSysAuthorityReq req) {
		GetSysAuthorityRsp rsp = new GetSysAuthorityRsp();

		return rsp;
	}

}
