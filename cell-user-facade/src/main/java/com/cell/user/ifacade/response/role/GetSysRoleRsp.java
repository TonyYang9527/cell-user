package com.cell.user.ifacade.response.role;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysRoleVo;

public class GetSysRoleRsp extends BaseResponse{

	private static final long serialVersionUID = 7810545079165177833L;

	
	  protected SysRoleVo role;


	public SysRoleVo getRole() {
		return role;
	}


	public void setRole(SysRoleVo role) {
		this.role = role;
	}
	  
	  
}
