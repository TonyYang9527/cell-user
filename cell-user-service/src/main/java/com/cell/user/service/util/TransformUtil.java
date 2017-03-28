package com.cell.user.service.util;

import com.cell.user.dao.entiy.SysAuthority;
import com.cell.user.ifacade.request.authority.UpdateSysAuthorityReq;

public class TransformUtil {

	public static Object transformActivityForQuery() {

		return null;
	}

	public static SysAuthority transSysAuthority(UpdateSysAuthorityReq req) {
		SysAuthority result = new SysAuthority();

		result.setId(req.getId());
		result.setGroupId(req.getGroupId());
		result.setJobId(req.getJobId());
		result.setOrganizationId(req.getOrganizationId());
		result.setRoleIds(req.getRoleIds());
		result.setType(req.getType());
		result.setUserId(req.getUserId());
		return result;
	}
}
