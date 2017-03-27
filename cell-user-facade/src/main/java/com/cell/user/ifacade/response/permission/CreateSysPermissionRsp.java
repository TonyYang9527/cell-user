package com.cell.user.ifacade.response.permission;

import com.cell.user.ifacade.response.BaseResponse;

public class CreateSysPermissionRsp extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3050188394443763876L;
	  private Long id;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
}
