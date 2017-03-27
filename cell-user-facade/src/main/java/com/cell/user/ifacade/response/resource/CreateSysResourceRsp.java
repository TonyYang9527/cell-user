package com.cell.user.ifacade.response.resource;

import com.cell.user.ifacade.response.BaseResponse;

public class CreateSysResourceRsp extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2815209924828926160L;
	  private Long id;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
}
