package com.cell.user.ifacade.request.authority;

import com.cell.user.ifacade.request.BaseRequest;

public class GetSysAuthorityReq extends BaseRequest {

	private static final long serialVersionUID = -4758062040498623126L;

	protected Long id;

	protected Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
