package com.cell.user.ifacade.request.relation;

import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class CreateRoleResourcePermissionReq extends BaseRequest {

	private static final long serialVersionUID = 2087968377116436707L;

	private Long roleId;

	private Long resourceId;

	private Set<Long>  permissionIds;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public Set<Long> getPermissionIds() {
		return permissionIds;
	}

	public void setPermissionIds(Set<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}
	
}
