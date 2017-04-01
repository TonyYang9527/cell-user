package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.permission.CreateSysPermissionReq;
import com.cell.user.ifacade.request.permission.DeleteSysPermissionRsp;
import com.cell.user.ifacade.request.permission.GetSysPermissionReq;
import com.cell.user.ifacade.request.permission.ListSysPermissionReq;
import com.cell.user.ifacade.request.permission.UpdateSysPermissionReq;
import com.cell.user.ifacade.response.permission.CreateSysPermissionRsp;
import com.cell.user.ifacade.response.permission.GetSysPermissionRsp;
import com.cell.user.ifacade.response.permission.ListSysPermissionRsp;
import com.cell.user.ifacade.response.permission.UpdateSysPermissionRsp;

public interface SysPermissionFacade {

	/**
	 * 创建权限信息
	 * 
	 * @param Req
	 * @return
	 */
	public CreateSysPermissionRsp createSysPermission(CreateSysPermissionReq req);

	/**
	 * 更新权限信息
	 * 
	 * @param Req
	 * @return
	 */
	public UpdateSysPermissionRsp updateSysPermission(UpdateSysPermissionReq req);

	/**
	 * 删除权限信息
	 * 
	 * @param Req
	 * @return
	 */
	public DeleteSysPermissionRsp deleteSysPermission(DeleteSysPermissionRsp req);

	/**
	 * 查询权限列表
	 * 
	 * @param Req
	 * @return
	 */
	public ListSysPermissionRsp listSysPermission(ListSysPermissionReq req);

	/**
	 * 查询权限列表
	 * 
	 * @param Req
	 * @return
	 */
	public GetSysPermissionRsp getSysPermission(GetSysPermissionReq req);

}
