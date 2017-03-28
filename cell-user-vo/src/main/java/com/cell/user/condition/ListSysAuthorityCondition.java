package com.cell.user.condition;

import java.io.Serializable;

public class ListSysAuthorityCondition implements Serializable {

	private static final long serialVersionUID = -5825593034171055393L;

	public Long id;
	public Long organizationId;
	public Long jobId;
	public Long userId;
	public Long groupId;
	public String roleIds;
	public Boolean type;
}
