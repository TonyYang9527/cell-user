package com.cell.user.ifacade.request.authority;

import java.util.List;
import java.util.Set;

import com.cell.user.ifacade.request.BaseRequest;

public class UpdateSysAuthorityReq extends BaseRequest {

	private static final long serialVersionUID = -3635553154866737026L;

	private Long id;

	private Long organizationId;

	private Long jobId;

	private Long userId;

	private Long groupId;

	private Set<Long> roleIds;

	private Boolean type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public Set<Long> getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Set<Long> roleIds) {
		this.roleIds = roleIds;
	}
	
}
