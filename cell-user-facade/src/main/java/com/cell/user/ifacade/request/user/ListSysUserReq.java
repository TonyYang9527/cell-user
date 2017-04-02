package com.cell.user.ifacade.request.user;

import com.cell.user.condition.ListSysUserCondition;
import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.page.Page;

public class ListSysUserReq extends BaseRequest {
	private static final long serialVersionUID = 3983456715458692995L;

	protected ListSysUserCondition condition;

	protected Page page;

	public ListSysUserCondition getCondition() {
		return condition;
	}

	public void setCondition(ListSysUserCondition condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
	
}
