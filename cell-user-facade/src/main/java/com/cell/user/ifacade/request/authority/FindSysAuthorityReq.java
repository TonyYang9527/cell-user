package com.cell.user.ifacade.request.authority;

import com.cell.user.ifacade.request.BaseRequest;

public class FindSysAuthorityReq extends BaseRequest {

	private static final long serialVersionUID = 1627573788638297592L;

	protected Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
