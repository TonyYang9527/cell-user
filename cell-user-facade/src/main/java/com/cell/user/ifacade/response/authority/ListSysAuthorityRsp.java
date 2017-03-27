package com.cell.user.ifacade.response.authority;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysAuthorityVo;

public class ListSysAuthorityRsp extends BaseResponse{

	private static final long serialVersionUID = -958914574210137485L;

	  protected PageResult<SysAuthorityVo> result;

	public PageResult<SysAuthorityVo> getResult() {
		return result;
	}

	public void setResult(PageResult<SysAuthorityVo> result) {
		this.result = result;
	}
	  
}
