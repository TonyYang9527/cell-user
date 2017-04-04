package com.cell.user.ifacade.response.relation;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysRoleResourcePermissionVo;

public class GetRoleResourcePermissionRsp extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1771417792213594182L;
	
	
	  protected SysRoleResourcePermissionVo relation;


	public SysRoleResourcePermissionVo getRelation() {
		return relation;
	}


	public void setRelation(SysRoleResourcePermissionVo relation) {
		this.relation = relation;
	} 
	 
	  
}
