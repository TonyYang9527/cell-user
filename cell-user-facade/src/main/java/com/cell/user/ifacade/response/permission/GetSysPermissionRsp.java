package com.cell.user.ifacade.response.permission;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysPermissionVo;

public class GetSysPermissionRsp  extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1848268817512318781L;

	
	  protected SysPermissionVo permission;


	public SysPermissionVo getPermission() {
		return permission;
	}


	public void setPermission(SysPermissionVo permission) {
		this.permission = permission;
	}

	
}
