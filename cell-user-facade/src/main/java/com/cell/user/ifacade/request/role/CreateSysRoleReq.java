package com.cell.user.ifacade.request.role;

import com.cell.user.ifacade.request.BaseRequest;

public class CreateSysRoleReq extends BaseRequest {

	private static final long serialVersionUID = -10186077336893483L;

	private String name;

	private String role;

	private String description;

	private Boolean display;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}

}
