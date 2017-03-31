package com.cell.user.ifacade.request.relation;

import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class CreateRoleResourcePermissionReq extends BaseRequest {

	private static final long serialVersionUID = 2087968377116436707L;

	private Long roleId;

	private Long resourceId;

	private Set<Long>  permissionIds;
}
