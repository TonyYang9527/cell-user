package com.cell.user.ifacade.request.user;

import java.util.Date;
import java.util.List;

import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.ifacade.request.authority.UpdateSysAuthorityReq;

public class UpdateSysUserReq extends BaseRequest {

	private static final long serialVersionUID = -2507133623271970753L;

	private Long id;

	private String username;

	private String email;

	private String mobile;

	private String password;

	private String salt;

	private String device;

	private Boolean status;

	private Boolean deleted;

	private Boolean admin;

	private Date createdTime;

	private String createdBy;

	  /*
     *添加 授权
     */
    private List<UpdateSysAuthorityReq> sysAuthoritis;
    
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
		this.username = username == null ? null : username.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device == null ? null : device.trim();
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

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy == null ? null : createdBy.trim();
	}

	public List<UpdateSysAuthorityReq> getSysAuthoritis() {
		return sysAuthoritis;
	}

	public void setSysAuthoritis(List<UpdateSysAuthorityReq> sysAuthoritis) {
		this.sysAuthoritis = sysAuthoritis;
	}
	
}
