package com.cell.user.ifacade.request.role;

import com.cell.user.ifacade.request.BaseRequest;

public class UpdateSysRoleReq extends BaseRequest {
	
	private static final long serialVersionUID = -3178206061808154258L;

	private Long id;

	private String name;

	private String role;

	private String description;

	private Boolean display;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role == null ? null : role.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
	}
}
