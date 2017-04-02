package com.cell.user.ifacade.request.resource;

import com.cell.user.condition.ListSysResourceCondition;
import com.cell.user.ifacade.request.BaseRequest;
import com.cell.user.page.Page;

public class ListSysResourceReq extends BaseRequest{

	private static final long serialVersionUID = 4279207370015383807L;

	
	protected ListSysResourceCondition condition;

	protected Page page;

	public ListSysResourceCondition getCondition() {
		return condition;
	}

	public void setCondition(ListSysResourceCondition condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

}
