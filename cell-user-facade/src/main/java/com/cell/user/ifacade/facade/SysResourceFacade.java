package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.resource.ChangeSysResourceRsp;
import com.cell.user.ifacade.request.resource.CheckSysResourceReq;
import com.cell.user.ifacade.request.resource.CreateSysResourceReq;
import com.cell.user.ifacade.request.resource.DeleteSysResourceRsp;
import com.cell.user.ifacade.request.resource.GetSysResourceReq;
import com.cell.user.ifacade.request.resource.ListSysResourceReq;
import com.cell.user.ifacade.request.resource.UpdateSysResourceReq;
import com.cell.user.ifacade.response.resource.CheckSysResourceRsp;
import com.cell.user.ifacade.response.resource.CreateSysResourceRsp;
import com.cell.user.ifacade.response.resource.GetSysResourceRsp;
import com.cell.user.ifacade.response.resource.ListSysResourceRsp;
import com.cell.user.ifacade.response.resource.UpdateSysResourceRsp;


public interface SysResourceFacade {

	/**
	 * 创建菜单信息
	 * 
	 * @param Req
	 * @return
	 */
	public CreateSysResourceRsp createSysResource(CreateSysResourceReq req);

	/**
	 * 更新菜单信息
	 * 
	 * @param Req
	 * @return
	 */
	public UpdateSysResourceRsp updateSysResource(UpdateSysResourceReq req);

	/**
	 * 删除菜单信息
	 * 
	 * @param Req
	 * @return
	 */
	public DeleteSysResourceRsp deleteSysResource(DeleteSysResourceRsp req);

	/**
	 * 查询菜单列表
	 * 
	 * @param Req
	 * @return
	 */
	public ListSysResourceRsp listSysResource(ListSysResourceReq req);

	/**
	 * 查询菜单列表
	 * 
	 * @param Req
	 * @return
	 */
	public GetSysResourceRsp getSysResource(GetSysResourceReq req);

	/**
	 * 显示/不显示菜单信息
	 * 
	 * @param Req
	 * @return
	 */
	public ChangeSysResourceRsp changeDisplaySysResource(
			ChangeSysResourceRsp req);
	
	/**
	 * 改变菜单图标信息
	 * 
	 * @param Req
	 * @return
	 */
	public ChangeSysResourceRsp changeIconSysResource(ChangeSysResourceRsp req);
	
	
	/**
	 * 改变菜单权重信息
	 * 
	 * @param Req
	 * @return
	 */
	public ChangeSysResourceRsp changeWeightSysResource(ChangeSysResourceRsp req);
	
	
	/**
	 *校验菜单信息
	 * 
	 * @param Req
	 * @return
	 */
	public CheckSysResourceRsp checkSysResource(CheckSysResourceReq req);
}
