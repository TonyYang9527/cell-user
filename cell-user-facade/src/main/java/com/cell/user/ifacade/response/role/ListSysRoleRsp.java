package com.cell.user.ifacade.response.role;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysRoleVo;

public class ListSysRoleRsp extends BaseResponse {

	private static final long serialVersionUID = -6218851626931464226L;

	protected PageResult<SysRoleVo> result;

	public PageResult<SysRoleVo> getResult() {
		return result;
	}

	public void setResult(PageResult<SysRoleVo> result) {
		this.result = result;
	}
}