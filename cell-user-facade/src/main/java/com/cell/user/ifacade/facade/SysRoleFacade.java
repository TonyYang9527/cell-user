package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.role.ChangeSysRoleReq;
import com.cell.user.ifacade.request.role.CheckSysRoleReq;
import com.cell.user.ifacade.request.role.CreateSysRoleReq;
import com.cell.user.ifacade.request.role.DeleteSysRoleRsp;
import com.cell.user.ifacade.request.role.GetSysRoleReq;
import com.cell.user.ifacade.request.role.UpdateSysRoleReq;
import com.cell.user.ifacade.response.role.ChangeSysRoleRsp;
import com.cell.user.ifacade.response.role.CheckSysRoleRsp;
import com.cell.user.ifacade.response.role.CreateSysRoleRsp;
import com.cell.user.ifacade.response.role.GetSysRoleRsp;
import com.cell.user.ifacade.response.role.ListSysRoleReq;
import com.cell.user.ifacade.response.role.ListSysRoleRsp;
import com.cell.user.ifacade.response.role.UpdateSysRoleRsp;


public interface SysRoleFacade {
	/**
	 * 创建角色信息
	 * 
	 * @param Req
	 * @return
	 */
	public CreateSysRoleRsp createSysRole(CreateSysRoleReq req);

	/**
	 * 更新角色信息
	 * 
	 * @param Req
	 * @return
	 */
	public UpdateSysRoleRsp updateSysRole(UpdateSysRoleReq req);

	/**
	 * 删除角色信息
	 * 
	 * @param Req
	 * @return
	 */
	public DeleteSysRoleRsp deleteSysRole(DeleteSysRoleRsp req);

	/**
	 * 查询角色列表
	 * 
	 * @param Req
	 * @return
	 */
	public ListSysRoleRsp listSysRole(ListSysRoleReq req);

	/**
	 * 查询角色列表
	 * 
	 * @param Req
	 * @return
	 */
	public GetSysRoleRsp getSysRole(GetSysRoleReq req);

	/**
	 * 显示/不显示角色信息
	 * 
	 * @param Req
	 * @return
	 */
	public ChangeSysRoleRsp changeDisplaySysRole(ChangeSysRoleReq req);

	/**
	 *校验角色信息
	 * 
	 * @param Req
	 * @return
	 */
	public CheckSysRoleRsp checkSysRole(CheckSysRoleReq req);
}
