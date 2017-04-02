package com.cell.user.ifacade.request.role;

import com.cell.user.condition.ListSysRoleCondition;
import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.Page;

public class ListSysRoleReq extends BaseResponse {

	private static final long serialVersionUID = 8971657564368142987L;


    protected  ListSysRoleCondition condition;

    protected Page page;

	public ListSysRoleCondition getCondition() {
		return condition;
	}

	public void setCondition(ListSysRoleCondition condition) {
		this.condition = condition;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
    
    
}
