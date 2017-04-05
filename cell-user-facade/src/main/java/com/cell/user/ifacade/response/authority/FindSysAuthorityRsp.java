package com.cell.user.ifacade.response.authority;

import java.util.List;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysAuthorityVo;

public class FindSysAuthorityRsp extends BaseResponse {

	private static final long serialVersionUID = -4658133671349699173L;

	protected List<SysAuthorityVo> authority;

	public List<SysAuthorityVo> getAuthority() {
		return authority;
	}

	public void setAuthority(List<SysAuthorityVo> authority) {
		this.authority = authority;
	}
	
	
}
