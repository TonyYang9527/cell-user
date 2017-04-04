package com.cell.user.ifacade.response.relation;

import com.cell.user.ifacade.response.BaseResponse;

public class CreateRoleResourcePermissionRsp extends BaseResponse {

	private static final long serialVersionUID = 4586308736691179923L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
