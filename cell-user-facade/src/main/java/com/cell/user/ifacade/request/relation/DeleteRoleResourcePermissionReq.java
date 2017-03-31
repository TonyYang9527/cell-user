package com.cell.user.ifacade.request.relation;

import com.cell.user.ifacade.request.BaseRequest;

public class DeleteRoleResourcePermissionReq extends BaseRequest {

	private static final long serialVersionUID = 7239300785381636635L;
	
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
