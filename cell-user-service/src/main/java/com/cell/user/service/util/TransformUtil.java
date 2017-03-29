package com.cell.user.service.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import com.cell.user.dao.entiy.SysAuthority;
import com.cell.user.ifacade.request.authority.UpdateSysAuthorityReq;
import com.cell.user.vo.single.SysAuthorityVo;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class TransformUtil {

	public static SysAuthority transSysAuthority(UpdateSysAuthorityReq req) {
		SysAuthority result = new SysAuthority();

		result.setId(req.getId());
		result.setGroupId(req.getGroupId());
		result.setJobId(req.getJobId());
		result.setOrganizationId(req.getOrganizationId());
		result.setRoleIds(Joiner.on(",").join(req.getRoleIds()) );
		result.setType(req.getType());
		result.setUserId(req.getUserId());
		return result;
	}

	public static List<SysAuthorityVo> transformSysAuthorityForQuery(
			List<SysAuthority> authorities) {
		if (CollectionUtils.isEmpty(authorities)) {
			return new ArrayList<SysAuthorityVo>();
		}

		List<SysAuthorityVo> results = Lists.transform(authorities,
				new Function<SysAuthority, SysAuthorityVo>() {
					public SysAuthorityVo apply(SysAuthority authority) {
						return transformSysAuthorityVoForQuery(authority);
					}
				});
		return new ArrayList<SysAuthorityVo>(results);
	}

	public static SysAuthorityVo transformSysAuthorityVoForQuery(
			SysAuthority authority) {

		SysAuthorityVo result = new SysAuthorityVo();
		if (authority == null)
			return null;

		result.setGroupId(authority.getGroupId());
		result.setId(authority.getId());
		result.setJobId(authority.getJobId());
		result.setOrganizationId(authority.getOrganizationId());
		
		List<String> list= Splitter.on(",").trimResults().splitToList(authority.getRoleIds());
		result.setRoleIds(list);
		result.setType(authority.getType());
		result.setUserId(authority.getUserId());
		return result;
	}
}
