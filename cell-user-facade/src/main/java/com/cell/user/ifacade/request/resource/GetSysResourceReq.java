package com.cell.user.ifacade.request.resource;

import com.cell.user.ifacade.request.BaseRequest;

public class GetSysResourceReq extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1385390716811239075L;

	   protected Long id;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
}
