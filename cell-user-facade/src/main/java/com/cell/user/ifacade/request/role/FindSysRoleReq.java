package com.cell.user.ifacade.request.role;

import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class FindSysRoleReq extends BaseRequest{


	private static final long serialVersionUID = 5319997062588292203L;

	
	protected Set<Long> ids;


	public Set<Long> getIds() {
		return ids;
	}


	public void setIds(Set<Long> ids) {
		this.ids = ids;
	}


}
