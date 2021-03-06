package com.cell.user.ifacade.request.user;

import java.util.List;

import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.ifacade.request.authority.CreateSysAuthorityReq;
public class CreateSysUserReq extends BaseRequest {

	private static final long serialVersionUID = 2827054258974072177L;

	private String username;

	private String email;

	private String mobile;

	private String password;

	private String device;

	private Boolean status;

	private Boolean deleted;

	private Boolean admin;

	private String createdBy;

	  /*
     *添加 授权
     */
    private List<CreateSysAuthorityReq> sysAuthoritis;
    
    
	public List<CreateSysAuthorityReq> getSysAuthoritis() {
		return sysAuthoritis;
	}

	public void setSysAuthoritis(List<CreateSysAuthorityReq> sysAuthoritis) {
		this.sysAuthoritis = sysAuthoritis;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
