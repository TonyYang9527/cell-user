package com.cell.user.ifacade.response.resource;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysResourceVo;

public class GetSysResourceRsp extends BaseResponse{

	private static final long serialVersionUID = 6841069695740648576L;

	  protected SysResourceVo resource;

	public SysResourceVo getResource() {
		return resource;
	}

	public void setResource(SysResourceVo resource) {
		this.resource = resource;
	}
	  
	  
}
