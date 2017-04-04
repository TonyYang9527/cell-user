package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysUser;
import com.cell.user.ifacade.facade.SysUserFacade;
import com.cell.user.ifacade.request.user.CreateSysUserReq;
import com.cell.user.ifacade.request.user.DeleteSysUserReq;
import com.cell.user.ifacade.request.user.GetSysUserReq;
import com.cell.user.ifacade.request.user.ListSysUserReq;
import com.cell.user.ifacade.request.user.UpdateSysUserReq;
import com.cell.user.ifacade.response.user.CreateSysUserRsp;
import com.cell.user.ifacade.response.user.DeleteSysUserRsp;
import com.cell.user.ifacade.response.user.GetSysUserRsp;
import com.cell.user.ifacade.response.user.ListSysUserRsp;
import com.cell.user.ifacade.response.user.UpdateSysUserRsp;
import com.cell.user.page.PageResult;
import com.cell.user.service.internal.UserService;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysUserVo;

@Service("sysUserService")
public class SysUserService implements SysUserFacade {

	private Logger logger = LoggerFactory.getLogger(SysUserService.class);

	@Resource
	protected UserService userService;

	@Override
	public CreateSysUserRsp createSysUser(CreateSysUserReq req) {

		CreateSysUserRsp rsp = new CreateSysUserRsp();

		Long id = userService.createSysUser(req);
		if (id > 0) {
			rsp.setId(id);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("创建用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("创建用户角色失败");
		}
		logger.info("createSysUser req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateSysUserRsp updateSysUser(UpdateSysUserReq req) {
		UpdateSysUserRsp rsp = new UpdateSysUserRsp();
		// 添加校验
		SysUser old = userService.getSysUserById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户角色失败");
			return rsp;
		}

		boolean retValue = userService.updateSysUser(req);
		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("更新用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户角色失败");
		}
		logger.info("updateSysUser req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteSysUserRsp deleteSysUser(DeleteSysUserReq req) {
		DeleteSysUserRsp rsp = new DeleteSysUserRsp();
		// 添加校验
		SysUser old = userService.getSysUserById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户角色失败");
			return rsp;
		}
		boolean retValue = userService.deleteSysUserById(req.getId());

		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("删除用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户角色失败");
		}
		logger.info("deleteSysUser req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public ListSysUserRsp listSysUser(ListSysUserReq req) {

		ListSysUserRsp rsp = new ListSysUserRsp();
		// 添加校验
		if (req.getCondition() != null) {
			PageResult<SysUserVo> result = userService.listSysUser(
					req.getCondition(), req.getPage());
			rsp.setResult(result);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("分页查询用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询条件为空");
		}
		logger.info("listSysUser req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public GetSysUserRsp getSysUser(GetSysUserReq req) {

		GetSysUserRsp rsp = new GetSysUserRsp();
		// 添加校验
		SysUser vo = userService.getSysUserById(req.getId());
		if (vo == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取用户角色失败");
			return rsp;
		} else {
			rsp.setUser(TransformUtil.transformSysUserVoForQuery(vo));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询用户角色成功");
		}
		logger.info("getSysUser req:{},rsp:{}", req, rsp);
		return rsp;
	}
}
