package com.cell.user.service.facade;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysPermission;
import com.cell.user.ifacade.facade.SysPermissionFacade;
import com.cell.user.ifacade.request.permission.CreateSysPermissionReq;
import com.cell.user.ifacade.request.permission.DeleteSysPermissionReq;
import com.cell.user.ifacade.request.permission.GetSysPermissionReq;
import com.cell.user.ifacade.request.permission.ListSysPermissionReq;
import com.cell.user.ifacade.request.permission.UpdateSysPermissionReq;
import com.cell.user.ifacade.response.permission.CreateSysPermissionRsp;
import com.cell.user.ifacade.response.permission.DeleteSysPermissionRsp;
import com.cell.user.ifacade.response.permission.GetSysPermissionRsp;
import com.cell.user.ifacade.response.permission.ListSysPermissionRsp;
import com.cell.user.ifacade.response.permission.UpdateSysPermissionRsp;
import com.cell.user.page.PageResult;
import com.cell.user.service.internal.PermissionService;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysPermissionVo;

@Service("sysPermissionService")
public class SysPermissionService implements SysPermissionFacade {

	private Logger logger = LoggerFactory.getLogger(SysPermissionService.class);

	@Resource
	protected PermissionService permissionService;

	@Override
	public CreateSysPermissionRsp createSysPermission(CreateSysPermissionReq req) {
		CreateSysPermissionRsp rsp = new CreateSysPermissionRsp();
		Long id = permissionService.createSysPermission(req);
		if (id > 0) {
			rsp.setId(id);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("创建权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("创建权限失败");
		}
		logger.info("createSysPermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateSysPermissionRsp updateSysPermission(UpdateSysPermissionReq req) {
		UpdateSysPermissionRsp rsp = new UpdateSysPermissionRsp();
		// 添加校验
		SysPermission old = permissionService.getSysPermissionById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新权限失败");
			return rsp;
		}

		boolean retValue = permissionService.updateSysPermission(req);
		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("更新权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新权限失败");
		}
		logger.info("updateSysPermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteSysPermissionRsp deleteSysPermission(DeleteSysPermissionReq req) {
		DeleteSysPermissionRsp rsp = new DeleteSysPermissionRsp();
		// 添加校验
		SysPermission old = permissionService.getSysPermissionById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除权限失败");
			return rsp;
		}
		boolean retValue = permissionService.deleteSysPermissionById(req
				.getId());

		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("删除权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除权限失败");
		}
		logger.info("deleteSysPermission req:{},rsp:{}", req, rsp);
		return rsp;

	}

	@Override
	public ListSysPermissionRsp listSysPermission(ListSysPermissionReq req) {

		ListSysPermissionRsp rsp = new ListSysPermissionRsp();
		// 添加校验
		if (req.getCondition() != null) {
			PageResult<SysPermissionVo> result = permissionService
					.listSysPermission(req.getCondition(), req.getPage());
			rsp.setResult(result);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("分页查询权限成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询条件为空");
		}
		logger.info("listSysPermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public GetSysPermissionRsp getSysPermission(GetSysPermissionReq req) {
		GetSysPermissionRsp rsp = new GetSysPermissionRsp();
		// 添加校验
		SysPermission permission = permissionService.getSysPermissionById(req
				.getId());
		if (permission == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取权限失败");
			return rsp;
		} else {
			rsp.setPermission(TransformUtil
					.transformSysPermissionVoForQuery(permission));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("获取权限成功");
		}
		logger.info("getSysPermission req:{},rsp:{}", req, rsp);
		return rsp;
	}

}
