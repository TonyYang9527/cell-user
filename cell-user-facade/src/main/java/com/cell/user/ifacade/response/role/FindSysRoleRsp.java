package com.cell.user.ifacade.response.role;

import java.util.List;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysRoleVo;

public class FindSysRoleRsp extends BaseResponse{

	private static final long serialVersionUID = -6251890565485347313L;

	protected List<SysRoleVo>   roles;

	public List<SysRoleVo> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRoleVo> roles) {
		this.roles = roles;
	}
	
	  
}
