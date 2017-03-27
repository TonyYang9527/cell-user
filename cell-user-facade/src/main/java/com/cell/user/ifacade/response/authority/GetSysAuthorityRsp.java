package com.cell.user.ifacade.response.authority;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysAuthorityVo;

public class GetSysAuthorityRsp extends BaseResponse {

	private static final long serialVersionUID = 2822894240254996626L;

	  protected SysAuthorityVo authority;

	public SysAuthorityVo getAuthority() {
		return authority;
	}

	public void setAuthority(SysAuthorityVo authority) {
		this.authority = authority;
	}
}
