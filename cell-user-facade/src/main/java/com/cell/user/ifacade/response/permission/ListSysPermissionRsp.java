package com.cell.user.ifacade.response.permission;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysPermissionVo;

public class ListSysPermissionRsp extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6574637615516494278L;

	
	  protected PageResult<SysPermissionVo> result;

	public PageResult<SysPermissionVo> getResult() {
		return result;
	}

	public void setResult(PageResult<SysPermissionVo> result) {
		this.result = result;
	}
}
