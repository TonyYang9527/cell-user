package com.cell.user.ifacade.request.user;

import com.cell.user.ifacade.request.BaseRequest;

public class GetSysUserReq extends BaseRequest{

	private static final long serialVersionUID = -3850924370619978530L;

	protected Long id;

	protected String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}	
}
