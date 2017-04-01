package com.cell.user.condition;

import java.io.Serializable;
import java.util.Set;

public class ListSysUserCondition implements Serializable {

	private static final long serialVersionUID = 6238623404255913275L;
	public Set<Long> ids;
	private String username;
	private Boolean status;
}
