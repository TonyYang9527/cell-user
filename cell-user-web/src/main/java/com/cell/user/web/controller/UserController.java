package com.cell.user.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cell.user.ifacade.facade.GetRoleFacade;
import com.cell.user.ifacade.request.GetRoleReq;
import com.cell.user.ifacade.response.GetRoleRsp;
import com.cell.user.vo.single.RoleVo;
import com.cell.user.web.support.BeanSupport;
import com.cell.user.web.support.Result;
import com.cell.user.web.support.RetCodeConst;

@Api(tags = { "消息服务" })
@RestController
@RequestMapping("/services/user")
public class UserController extends BeanSupport {

	@Autowired
	private GetRoleFacade getRoleFacade;

	/**
	 * 获取role
	 * 
	 * @param id
	 */
	@ApiOperation(value = "删除消息")
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Result<RoleVo> getRoleById(
			@RequestParam(value = "id", required = true) Long id) {
		if (id == null)
			return fail("id异常");
		// // 获取远程服务代理
		GetRoleReq req = new GetRoleReq();
		req.setId(new Long(105));
		GetRoleRsp rsp = getRoleFacade.getRole(req);
		if (rsp == null || RetCodeConst.FAIL.equals(rsp.getRetCode()))
			return fail("返回异常");
		return success(rsp.getRole());
	}

}
