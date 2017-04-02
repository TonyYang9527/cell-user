package com.cell.user.ifacade.request.relation;

import com.cell.user.condition.ListRoleResourcePermissionCondition;
import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.page.Page;

public class ListRoleResourcePermissionReq extends BaseRequest {

	private static final long serialVersionUID = -8364119616835358251L;

	protected ListRoleResourcePermissionCondition condition;

	protected Page page;

	public ListRoleResourcePermissionCondition getCondition() {
		return condition;
	}

	public void setCondition(ListRoleResourcePermissionCondition condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

}
