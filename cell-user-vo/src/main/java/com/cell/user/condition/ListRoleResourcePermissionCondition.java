package com.cell.user.condition;

import java.io.Serializable;
import java.util.Set;

public class ListRoleResourcePermissionCondition implements Serializable {

	private static final long serialVersionUID = -6751310823414767216L;

	public Long id;

	public Long roleId;

	public Long resourceId;

	public Set<Long> permissionIds;
	
}
