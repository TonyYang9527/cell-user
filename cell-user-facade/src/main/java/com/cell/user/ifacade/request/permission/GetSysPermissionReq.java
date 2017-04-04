package com.cell.user.ifacade.request.permission;

import com.cell.user.ifacade.request.BaseRequest;

public class GetSysPermissionReq extends BaseRequest {

	private static final long serialVersionUID = -8390779786193745406L;

	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
