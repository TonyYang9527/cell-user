package com.cell.user.ifacade.request.user;

import com.cell.user.ifacade.request.BaseRequest;

public class DeleteSysUserReq extends BaseRequest {

	private static final long serialVersionUID = 4764367189836978944L;
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
