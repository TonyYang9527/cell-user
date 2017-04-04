package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysRole;
import com.cell.user.ifacade.facade.SysRoleFacade;
import com.cell.user.ifacade.request.role.CreateSysRoleReq;
import com.cell.user.ifacade.request.role.DeleteSysRoleReq;
import com.cell.user.ifacade.request.role.GetSysRoleReq;
import com.cell.user.ifacade.request.role.ListSysRoleReq;
import com.cell.user.ifacade.request.role.UpdateSysRoleReq;
import com.cell.user.ifacade.response.role.CreateSysRoleRsp;
import com.cell.user.ifacade.response.role.DeleteSysRoleRsp;
import com.cell.user.ifacade.response.role.GetSysRoleRsp;
import com.cell.user.ifacade.response.role.ListSysRoleRsp;
import com.cell.user.ifacade.response.role.UpdateSysRoleRsp;
import com.cell.user.page.PageResult;
import com.cell.user.service.internal.RoleService;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysRoleVo;

@Service("sysRoleService")
public class SysRoleService implements SysRoleFacade {

	private Logger logger = LoggerFactory.getLogger(SysRoleService.class);

	@Resource
	protected RoleService roleService;

	@Override
	public CreateSysRoleRsp createSysRole(CreateSysRoleReq req) {

		CreateSysRoleRsp rsp = new CreateSysRoleRsp();

		Long id = roleService.createSysRole(req);
		if (id > 0) {
			rsp.setId(id);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("创建用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("创建用户角色失败");
		}
		logger.info("createSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateSysRoleRsp updateSysRole(UpdateSysRoleReq req) {
		UpdateSysRoleRsp rsp = new UpdateSysRoleRsp();
		// 添加校验
		SysRole old = roleService.getSysRoleById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户角色失败");
			return rsp;
		}

		boolean retValue = roleService.updateSysRole(req);
		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("更新用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户角色失败");
		}
		logger.info("updateSysRole req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteSysRoleRsp deleteSysRole(DeleteSysRoleReq req) {

		DeleteSysRoleRsp rsp = new DeleteSysRoleRsp();
		// 添加校验
		SysRole old = roleService.getSysRoleById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户角色失败");
			return rsp;
		}
		boolean retValue = roleService.deleteSysRoleById(req.getId());

		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("删除用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户角色失败");
		}
		logger.info("deleteSysAuthority req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public ListSysRoleRsp listSysRole(ListSysRoleReq req) {

		ListSysRoleRsp rsp = new ListSysRoleRsp();
		// 添加校验
		if (req.getCondition() != null) {
			PageResult<SysRoleVo> result = roleService.listSysRole(
					req.getCondition(), req.getPage());
			rsp.setResult(result);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("分页查询用户角色成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询条件为空");
		}
		logger.info("listSysRole req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public GetSysRoleRsp getSysRole(GetSysRoleReq req) {
		GetSysRoleRsp rsp = new GetSysRoleRsp();
		// 添加校验
		SysRole vo = roleService.getSysRoleById(req
				.getId());
		if (vo == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取用户角色失败");
			return rsp;
		} else {
			rsp.setRole(TransformUtil
					.transformSysRoleVoForQuery(vo));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询用户角色成功");
		}
		logger.info("getSysRole req:{},rsp:{}", req, rsp);
		return rsp;
	}

}
