package com.cell.user.ifacade.request.user;

import com.cell.user.ifacade.request.BaseRequest;

public class FindSysUserReq  extends BaseRequest{
	
	private static final long serialVersionUID = -5706407636978976336L;


	protected String username;
	
	protected String email;
	
	protected String mobile;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
