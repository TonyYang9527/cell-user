package com.cell.user.ifacade.request.authority;

import com.cell.user.condition.ListSysAuthorityCondition;
import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.page.Page;

public class ListSysAuthorityReq extends BaseRequest{


	private static final long serialVersionUID = -2779451363401602595L;

    protected  ListSysAuthorityCondition condition;

    protected Page page;

	public ListSysAuthorityCondition getCondition() {
		return condition;
	}

	public void setCondition(ListSysAuthorityCondition condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}


}
