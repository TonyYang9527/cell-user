package com.cell.user.ifacade.request.permission;

import com.cell.user.condition.ListSysPermissionCondition;
import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.page.Page;

public class ListSysPermissionReq extends BaseRequest {

	private static final long serialVersionUID = 6616310443724540592L;

    protected  ListSysPermissionCondition condition;

    protected Page page;

	public ListSysPermissionCondition getCondition() {
		return condition;
	}

	public void setCondition(ListSysPermissionCondition condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

}
