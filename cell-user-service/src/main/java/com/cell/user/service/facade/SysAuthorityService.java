package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysAuthority;
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
import com.cell.user.page.PageResult;
import com.cell.user.service.check.CheckSysAuthorityReqParaService;
import com.cell.user.service.internal.AuthorityService;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysAuthorityVo;

@Service("sysAuthorityService")
public class SysAuthorityService implements SysAuthorityFacade {

	private Logger logger = LoggerFactory.getLogger(SysAuthorityService.class);
	@Resource
	protected AuthorityService authorityService;

	@Autowired
	private CheckSysAuthorityReqParaService checkReqParaService;

	@Override
	public CreateSysAuthorityRsp createSysAuthority(CreateSysAuthorityReq req) {

		CreateSysAuthorityRsp rsp = checkReqParaService
				.checkCreateActivityReq(req);
		if (Constants.RESPONSE_SUCCESS_CODE.equals(rsp.getRetCode())) {
			Long sysAuthorityId = authorityService.createSysAuthority(req);
			if (sysAuthorityId > 0) {
				rsp.setId(sysAuthorityId);
				rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
				rsp.setRetMsg("创建用户权限成功");
			} else {
				rsp.setId(sysAuthorityId);
				rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
				rsp.setRetMsg("创建用户权限失败");
			}
		}

		logger.info("createSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateSysAuthorityRsp updateSysAuthority(UpdateSysAuthorityReq req) {

		UpdateSysAuthorityRsp rsp = new UpdateSysAuthorityRsp();
		// 添加校验
		SysAuthority old = authorityService.getSysAuthorityById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户权限失败");
			return rsp;
		}

		boolean retValue = authorityService.updateSysAuthority(req);
		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("更新用户权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户权限失败");
		}
		logger.info("updateSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteSysAuthorityRsp deleteSysAuthority(DeleteSysAuthorityReq req) {

		DeleteSysAuthorityRsp rsp = new DeleteSysAuthorityRsp();
		// 添加校验
		SysAuthority authority = authorityService.getSysAuthorityById(req
				.getId());
		if (authority == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户权限失败");
			return rsp;
		}
		boolean retValue = authorityService.deleteSysAuthorityById(req.getId());

		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("删除用户权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户权限失败");
		}
		logger.info("deleteSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public ListSysAuthorityRsp listSysAuthority(ListSysAuthorityReq req) {
		ListSysAuthorityRsp rsp = new ListSysAuthorityRsp();
		// 添加校验
		if (req.getCondition() != null) {
			PageResult<SysAuthorityVo> result = authorityService
					.listSysAuthority(req.getCondition(), req.getPage());
			rsp.setResult(result);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("分页查询用户权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询条件为空");
		}
		logger.info("listSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public GetSysAuthorityRsp getSysAuthority(GetSysAuthorityReq req) {
		GetSysAuthorityRsp rsp = new GetSysAuthorityRsp();
		// 添加校验
		SysAuthority authority = authorityService.getSysAuthorityById(req
				.getId());
		if (authority == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取用户权限失败");
			return rsp;
		} else {
			rsp.setAuthority(TransformUtil
					.transformSysAuthorityVoForQuery(authority));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询用户权限成功");
		}
		logger.info("getSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

}
