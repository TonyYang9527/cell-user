package com.cell.user.vo.single;

import java.io.Serializable;
import java.util.Set;

public class SysRoleResourcePermissionVo implements Serializable {

	private static final long serialVersionUID = -3862331030894389671L;

	private Long id;

	private Long roleId;

	private Long resourceId;

	private Set<Long> permissionIds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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