package com.cell.user.ifacade.request.relation;

import com.cell.user.ifacade.request.BaseRequest;

public class GetRoleResourcePermissionReq extends BaseRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4378817971718454517L;

	   protected Long id;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
}
