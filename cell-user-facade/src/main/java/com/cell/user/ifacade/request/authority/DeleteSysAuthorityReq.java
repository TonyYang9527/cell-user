package com.cell.user.ifacade.request.authority;

import com.cell.user.ifacade.request.BaseRequest;

public class DeleteSysAuthorityReq extends BaseRequest {

	private static final long serialVersionUID = -6592237480966349367L;
	
	protected Long id;

	/*
	 * 删除者
	 */
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
