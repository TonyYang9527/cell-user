package com.cell.user.ifacade.request.permission;

import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class FindSysPermissionReq extends BaseRequest {

	private static final long serialVersionUID = -2102778859208941478L;
	
	protected Set<Long> ids;

	public Set<Long> getIds() {
		return ids;
	}

	public void setIds(Set<Long> ids) {
		this.ids = ids;
	}
	
	
}
