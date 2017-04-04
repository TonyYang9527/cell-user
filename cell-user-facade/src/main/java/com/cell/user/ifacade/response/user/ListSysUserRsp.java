package com.cell.user.ifacade.response.user;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysUserVo;

public class ListSysUserRsp extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7975591152847382247L;

	
	protected PageResult<SysUserVo> result;

	public PageResult<SysUserVo> getResult() {
		return result;
	}

	public void setResult(PageResult<SysUserVo> result) {
		this.result = result;
	}
}
