package com.cell.user.service.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.cell.user.dao.entiy.SysAuthority;
import com.cell.user.dao.entiy.SysPermission;
import com.cell.user.dao.entiy.SysResource;
import com.cell.user.dao.entiy.SysRole;
import com.cell.user.dao.entiy.SysRoleResourcePermission;
import com.cell.user.dao.entiy.SysUser;
import com.cell.user.ifacade.request.authority.UpdateSysAuthorityReq;
import com.cell.user.utils.String2Set;
import com.cell.user.vo.single.SysAuthorityVo;
import com.cell.user.vo.single.SysPermissionVo;
import com.cell.user.vo.single.SysResourceVo;
import com.cell.user.vo.single.SysRoleResourcePermissionVo;
import com.cell.user.vo.single.SysRoleVo;
import com.cell.user.vo.single.SysUserVo;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

public class TransformUtil {

	public static SysAuthority transSysAuthority(UpdateSysAuthorityReq req) {
		SysAuthority result = new SysAuthority();

		result.setId(req.getId());
		result.setGroupId(req.getGroupId());
		result.setJobId(req.getJobId());
		result.setOrganizationId(req.getOrganizationId());
		String rolesIds = Joiner.on(",").join(req.getRoleIds());
		result.setRoleIds(rolesIds);
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
		result.setRoleIds(String2Set.toSet(authority.getRoleIds()));
		result.setType(authority.getType());
		result.setUserId(authority.getUserId());
		return result;
	}

	public static SysPermissionVo transformSysPermissionVoForQuery(
			SysPermission permission) {

		SysPermissionVo result = new SysPermissionVo();
		if (permission == null)
			return null;

		result.setId(permission.getId());
		result.setName(permission.getName());
		result.setPermission(permission.getPermission());
		result.setDescription(permission.getDescription());
		result.setDisplay(permission.getDisplay());
		return result;
	}

	public static List<SysPermissionVo> transformSysPermissionForQuery(
			List<SysPermission> permissions) {
		if (CollectionUtils.isEmpty(permissions)) {
			return new ArrayList<SysPermissionVo>();
		}

		List<SysPermissionVo> results = Lists.transform(permissions,
				new Function<SysPermission, SysPermissionVo>() {
					public SysPermissionVo apply(SysPermission permisson) {
						return transformSysPermissionVoForQuery(permisson);
					}
				});
		return new ArrayList<SysPermissionVo>(results);
	}

	public static SysResourceVo transformSysResourceVoForQuery(
			SysResource resource) {

		SysResourceVo result = new SysResourceVo();
		if (resource == null)
			return null;

		result.setId(resource.getId());
		result.setIdentity(resource.getIdentity());
		result.setName(resource.getName());
		result.setParentId(resource.getParentId());
		result.setParentIds(resource.getParentIds());
		result.setUrl(resource.getUrl());
		result.setWeight(resource.getWeight());
		result.setIcon(resource.getIcon());
		result.setDisplay(resource.getDisplay());
		return result;
	}

	public static List<SysResourceVo> transformSysResourceForQuery(
			List<SysResource> resources) {
		if (CollectionUtils.isEmpty(resources)) {
			return new ArrayList<SysResourceVo>();
		}
		List<SysResourceVo> results = Lists.transform(resources,
				new Function<SysResource, SysResourceVo>() {
					public SysResourceVo apply(SysResource resouce) {
						return transformSysResourceVoForQuery(resouce);
					}
				});
		return new ArrayList<SysResourceVo>(results);
	}

	public static SysRoleResourcePermissionVo transformSysRoleResourcePermissionVoForQuery(
			SysRoleResourcePermission relation) {

		SysRoleResourcePermissionVo result = new SysRoleResourcePermissionVo();
		if (relation == null)
			return null;

		result.setId(relation.getId());
		result.setPermissionIds(String2Set.toSet(relation.getPermissionIds()));
		result.setResourceId(relation.getResourceId());
		result.setRoleId(relation.getRoleId());
		return result;
	}

	public static List<SysRoleResourcePermissionVo> transformSysRoleResourcePermissionForQuery(
			List<SysRoleResourcePermission> relations) {
		if (CollectionUtils.isEmpty(relations)) {
			return new ArrayList<SysRoleResourcePermissionVo>();
		}
		List<SysRoleResourcePermissionVo> results = Lists
				.transform(
						relations,
						new Function<SysRoleResourcePermission, SysRoleResourcePermissionVo>() {
							public SysRoleResourcePermissionVo apply(
									SysRoleResourcePermission relation) {
								return transformSysRoleResourcePermissionVoForQuery(relation);
							}
						});
		return new ArrayList<SysRoleResourcePermissionVo>(results);
	}

	public static SysRoleVo transformSysRoleVoForQuery(SysRole role) {

		SysRoleVo result = new SysRoleVo();
		if (role == null)
			return null;

		result.setId(role.getId());
		result.setName(role.getName());
		result.setRole(role.getRole());
		result.setDescription(role.getDescription());
		result.setDisplay(role.getDisplay());
		return result;
	}

	public static List<SysRoleVo> transformSysRoleForQuery(List<SysRole> roles) {
		if (CollectionUtils.isEmpty(roles)) {
			return new ArrayList<SysRoleVo>();
		}
		List<SysRoleVo> results = Lists.transform(roles,
				new Function<SysRole, SysRoleVo>() {
					public SysRoleVo apply(SysRole role) {
						return transformSysRoleVoForQuery(role);
					}
				});
		return new ArrayList<SysRoleVo>(results);
	}

	public static SysUserVo transformSysUserVoForQuery(SysUser user) {

		SysUserVo result = new SysUserVo();
		if (user == null)
			return null;

		result.setId(user.getId());
		result.setMobile(user.getMobile());
		result.setPassword(user.getPassword());
        result.setSalt(user.getSalt());
        result.setStatus(user.getStatus());
        result.setUsername(user.getUsername());
        result.setAdmin(user.getAdmin());
        result.setCreatedBy(user.getCreatedBy());
        result.setCreatedTime(user.getCreatedTime());
        result.setDeleted(user.getDeleted());
        result.setDevice(user.getDevice());
        result.setEmail(user.getEmail());
		return result;
	}

	public static List<SysUserVo> transformSysUserForQuery(List<SysUser> users) {
		if (CollectionUtils.isEmpty(users)) {
			return new ArrayList<SysUserVo>();
		}
		List<SysUserVo> results = Lists.transform(users,
				new Function<SysUser, SysUserVo>() {
					public SysUserVo apply(SysUser user) {
						return transformSysUserVoForQuery(user);
					}
				});
		return new ArrayList<SysUserVo>(results);
	}
}
