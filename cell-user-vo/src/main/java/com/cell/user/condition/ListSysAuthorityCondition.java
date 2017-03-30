package com.cell.user.condition;

import java.io.Serializable;
import java.util.List;

public class ListSysAuthorityCondition implements Serializable {

	private static final long serialVersionUID = -5825593034171055393L;
	public List<Long> organizationIds;
	public List<Long> jobIds;
	public List<Long> userIds;
	public List<Long> groupIds;
}
