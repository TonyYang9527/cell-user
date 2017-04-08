package com.cell.user.ifacade.request.relation;

import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class FindRoleResourcePermissionReq extends BaseRequest {

	private static final long serialVersionUID = -4798588830710167578L;

	
	protected Set<Long> roleIds;


	public Set<Long> getRoleIds() {
		return roleIds;
	}


	public void setRoleIds(Set<Long> roleIds) {
		this.roleIds = roleIds;
	}

}
