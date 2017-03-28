package com.cell.user.ifacade.request.authority;

import com.cell.user.ifacade.request.BaseRequest;

public class CreateSysAuthorityReq extends BaseRequest {

	private static final long serialVersionUID = -1630850429091967997L;

	private Long organizationId;

	private Long jobId;

	private Long userId;

	private Long groupId;

	private String roleIds;

	private Boolean type;

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

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

}
