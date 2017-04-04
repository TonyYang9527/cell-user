package com.cell.user.ifacade.response.relation;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysRoleResourcePermissionVo;

public class ListRoleResourcePermissionRsp extends BaseResponse {

	private static final long serialVersionUID = -2458193321838796128L;

	
	  protected PageResult<SysRoleResourcePermissionVo> result;

	public PageResult<SysRoleResourcePermissionVo> getResult() {
		return result;
	}

	public void setResult(PageResult<SysRoleResourcePermissionVo> result) {
		this.result = result;
	}
	  
}
