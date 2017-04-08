package com.cell.user.ifacade.response.resource;

import java.util.List;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysResourceVo;

public class FindSysResourceRsp extends BaseResponse {

	private static final long serialVersionUID = 4989702442868598095L;

	protected List<SysResourceVo> resources;

	public List<SysResourceVo> getResources() {
		return resources;
	}

	public void setResources(List<SysResourceVo> resources) {
		this.resources = resources;
	}

}
