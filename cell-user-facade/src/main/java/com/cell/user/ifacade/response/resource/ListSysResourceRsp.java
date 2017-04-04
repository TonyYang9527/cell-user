package com.cell.user.ifacade.response.resource;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysResourceVo;

public class ListSysResourceRsp extends BaseResponse {

	private static final long serialVersionUID = -8649393614683053885L;

	protected PageResult<SysResourceVo> result;

	public PageResult<SysResourceVo> getResult() {
		return result;
	}

	public void setResult(PageResult<SysResourceVo> result) {
		this.result = result;
	}

}
