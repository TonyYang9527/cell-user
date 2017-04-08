package com.cell.user.ifacade.response.permission;

import java.util.List;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysPermissionVo;

public class FindSysPermissionRsp extends BaseResponse {

	private static final long serialVersionUID = 2993342297045074669L;

	protected List<SysPermissionVo> permissions;

	public List<SysPermissionVo> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermissionVo> permissions) {
		this.permissions = permissions;
	}

}
