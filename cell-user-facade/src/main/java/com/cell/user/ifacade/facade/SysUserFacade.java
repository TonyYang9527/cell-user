package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.user.CreateSysUserReq;
import com.cell.user.ifacade.request.user.GetSysUserReq;
import com.cell.user.ifacade.request.user.ListSysUserReq;
import com.cell.user.ifacade.request.user.UpdateSysUserReq;
import com.cell.user.ifacade.response.user.CreateSysUserRsp;
import com.cell.user.ifacade.response.user.DeleteSysUserRsp;
import com.cell.user.ifacade.response.user.GetSysUserRsp;
import com.cell.user.ifacade.response.user.ListSysUserRsp;
import com.cell.user.ifacade.response.user.UpdateSysUserRsp;

public interface SysUserFacade {

	/**
	 * 创建用户信息
	 * 
	 * @param Req
	 * @return
	 */
	public CreateSysUserRsp createSysUser(CreateSysUserReq req);

	/**
	 * 更新用户信息
	 * 
	 * @param Req
	 * @return
	 */
	public UpdateSysUserRsp updateSysUser(UpdateSysUserReq req);

	/**
	 * 删除用户信息
	 * 
	 * @param Req
	 * @return
	 */
	public DeleteSysUserRsp deleteSysUser(DeleteSysUserRsp req);

	/**
	 * 查询用户列表
	 * 
	 * @param Req
	 * @return
	 */
	public ListSysUserRsp listSysUser(ListSysUserReq req);

	/**
	 * 查询用户列表
	 * 
	 * @param Req
	 * @return
	 */
	public GetSysUserRsp getSysUser(GetSysUserReq req);

}
