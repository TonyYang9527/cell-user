package com.cell.user.ifacade.request.resource;

import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class FindSysResourceReq extends BaseRequest {

	private static final long serialVersionUID = 3906399424595298578L;

	protected Set<Long> ids;

	protected Set<Long> parentIds;

	public Set<Long> getIds() {
		return ids;
	}

	public void setIds(Set<Long> ids) {
		this.ids = ids;
	}

	public Set<Long> getParentIds() {
		return parentIds;
	}

	public void setParentIds(Set<Long> parentIds) {
		this.parentIds = parentIds;
	}

}
