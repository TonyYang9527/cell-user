package com.cell.user.ifacade.request.permission;

import com.cell.user.ifacade.request.BaseRequest;

public class UpdateSysPermissionReq  extends BaseRequest{

	private static final long serialVersionUID = 7477015197179601141L;

	private Long id;

	private String name;

	private String permission;

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
		this.name = name;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
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
