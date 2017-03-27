package com.cell.user.ifacade.response.user;

import com.cell.user.ifacade.response.BaseResponse;

public class CreateSysUserRsp extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7740583737211895444L;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
