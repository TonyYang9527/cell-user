package com.cell.user.ifacade.request.role;

import com.cell.user.ifacade.request.BaseRequest;

public class DeleteSysRoleRsp extends BaseRequest {

	private static final long serialVersionUID = -5128228668152026060L;

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
