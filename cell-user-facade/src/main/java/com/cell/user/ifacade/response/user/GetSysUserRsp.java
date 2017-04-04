package com.cell.user.ifacade.response.user;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysUserVo;

public class GetSysUserRsp extends BaseResponse {

	private static final long serialVersionUID = -1816768028555089935L;
	protected SysUserVo user;

	public SysUserVo getUser() {
		return user;
	}

	public void setUser(SysUserVo user) {
		this.user = user;
	}

}
