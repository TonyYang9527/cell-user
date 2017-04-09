package com.cell.user.ifacade.response.user;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysUserVo;

public class FindSysUserRsp extends BaseResponse {

	private static final long serialVersionUID = -7991512746848674244L;

	protected SysUserVo user;

	public SysUserVo getUser() {
		return user;
	}

	public void setUser(SysUserVo user) {
		this.user = user;
	}

}
