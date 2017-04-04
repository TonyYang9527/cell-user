package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysRoleResourcePermission;
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
import com.cell.user.page.PageResult;
import com.cell.user.service.internal.RoleResourcePermissionService;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysRoleResourcePermissionVo;

@Service("sysRoleResourcePermissionService")
public class SysRoleResourcePermissionService implements
		SysRoleResourcePermissionFacade {

	private Logger logger = LoggerFactory
			.getLogger(SysRoleResourcePermissionService.class);

	@Resource
	protected RoleResourcePermissionService relationService;

	@Override
	public CreateRoleResourcePermissionRsp createRoleResourcePermission(
			CreateRoleResourcePermissionReq req) {

		CreateRoleResourcePermissionRsp rsp = new CreateRoleResourcePermissionRsp();

		Long id = relationService.createSysRoleResourcePermission(req);
		if (id > 0) {
			rsp.setId(id);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("创建用户权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("创建用户权限失败");
		}
		logger.info("createRoleResourcePermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateRoleResourcePermissionRsp updateRoleResourcePermission(
			UpdateRoleResourcePermissionReq req) {

		UpdateRoleResourcePermissionRsp rsp = new UpdateRoleResourcePermissionRsp();
		// 添加校验
		SysRoleResourcePermission old = relationService
				.getSysRoleResourcePermissionById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户权限失败");
			return rsp;
		}

		boolean retValue = relationService.updateSysRoleResourcePermission(req);
		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("更新用户权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新用户权限失败");
		}
		logger.info("updateRoleResourcePermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteRoleResourcePermissionRsp deleteRoleResourcePermission(
			DeleteRoleResourcePermissionReq req) {
		DeleteRoleResourcePermissionRsp rsp = new DeleteRoleResourcePermissionRsp();
		// 添加校验
		SysRoleResourcePermission old = relationService
				.getSysRoleResourcePermissionById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除用户权限失败");
			return rsp;
		}
		boolean retValue = relationService
				.deleteSysRoleResourcePermissionById(req.getId());

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
	public ListRoleResourcePermissionRsp listRoleResourcePermission(
			ListRoleResourcePermissionReq req) {

		ListRoleResourcePermissionRsp rsp = new ListRoleResourcePermissionRsp();
		// 添加校验
		if (req.getCondition() != null) {
			PageResult<SysRoleResourcePermissionVo> result = relationService
					.listSysRoleResourcePermission(req.getCondition(),
							req.getPage());
			rsp.setResult(result);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("分页查询用户权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询条件为空");
		}
		logger.info("listRoleResourcePermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public GetRoleResourcePermissionRsp getRoleResourcePermission(
			GetRoleResourcePermissionReq req) {

		GetRoleResourcePermissionRsp rsp = new GetRoleResourcePermissionRsp();
		// 添加校验
		SysRoleResourcePermission vo = relationService
				.getSysRoleResourcePermissionById(req.getId());
		if (vo == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取用户权限失败");
			return rsp;
		} else {
			rsp.setRelation(TransformUtil
					.transformSysRoleResourcePermissionVoForQuery(vo));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询用户权限成功");
		}
		logger.info("getRoleResourcePermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

}
