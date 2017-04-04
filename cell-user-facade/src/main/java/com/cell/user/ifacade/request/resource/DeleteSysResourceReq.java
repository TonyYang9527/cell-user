package com.cell.user.ifacade.request.resource;

import com.cell.user.ifacade.request.BaseRequest;

public class DeleteSysResourceReq extends BaseRequest {

	
	private static final long serialVersionUID = -6127175016876273312L;

	protected Long id;

	protected String deletedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
}
