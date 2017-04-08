package com.cell.user.service.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.cell.user.condition.ListRoleResourcePermissionCondition;
import com.cell.user.dao.entiy.SysRoleResourcePermission;
import com.cell.user.dao.entiy.SysRoleResourcePermissionExample;
import com.cell.user.dao.mapper.SysRoleResourcePermissionMapper;
import com.cell.user.ifacade.request.relation.CreateRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.UpdateRoleResourcePermissionReq;
import com.cell.user.page.Page;
import com.cell.user.page.PageResult;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysRoleResourcePermissionVo;
import com.google.common.base.Joiner;

@Service("roleResourcePermissionService")
public class RoleResourcePermissionService {

	private Logger logger = LoggerFactory
			.getLogger(RoleResourcePermissionService.class);

	@Resource
	protected SysRoleResourcePermissionMapper sysRoleResourcePermissionMapper;

	/**
	 * 根据主键获取SysRoleResourcePermission.
	 *
	 * @param id
	 *            the id
	 * @return SysRoleResourcePermission
	 */
	public SysRoleResourcePermission getSysRoleResourcePermissionById(Long id) {
		SysRoleResourcePermission relation = sysRoleResourcePermissionMapper
				.selectByPrimaryKey(id);
		logger.info("getSysRoleResourcePermissionById  id:{},relation:{}",
				JSON.toJSONString(id), JSON.toJSONString(relation));
		if (relation != null) {
			return relation;
		}
		return null;
	}

	/**
	 * 创建 SysRoleResourcePermission.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysRoleResourcePermission(
			CreateRoleResourcePermissionReq req) {

		SysRoleResourcePermission relation = new SysRoleResourcePermission();
		relation.setRoleId(req.getRoleId());
		relation.setResourceId(req.getResourceId());
		relation.setPermissionIds(Joiner.on(",").join(req.getPermissionIds()));
		sysRoleResourcePermissionMapper.insertSelective(relation);
		logger.info("createSysRoleResourcePermission  relation:{}",
				JSON.toJSONString(relation));
		// 后面加入缓存
		return relation.getId();
	}

	/**
	 * 更新 SysRoleResourcePermission
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean updateSysRoleResourcePermission(
			UpdateRoleResourcePermissionReq req) {

		SysRoleResourcePermission relation = new SysRoleResourcePermission();
		relation.setRoleId(req.getRoleId());
		relation.setResourceId(req.getResourceId());
		relation.setPermissionIds(Joiner.on(",").join(req.getPermissionIds()));

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(req.getId());

		logger.info("updateSysRoleResourcePermission  relation:{}",
				JSON.toJSONString(relation));
		sysRoleResourcePermissionMapper.updateByExampleSelective(relation,
				example);

		return true;
	}

	/**
	 * 根据id 删除 SysRoleResourcePermission.
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean deleteSysRoleResourcePermissionById(Long id) {

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria criteria = example
				.createCriteria();
		criteria.andIdEqualTo(id);
		logger.info("deleteSysRoleResourcePermissionById  id:{}",
				JSON.toJSONString(id));
		sysRoleResourcePermissionMapper.deleteByExample(example);
		return true;
	}

	/**
	 * 根据条件 查询 SysRoleResourcePermission列表.
	 * 
	 * @param record
	 * @return PageResult
	 */
	public PageResult<SysRoleResourcePermissionVo> listSysRoleResourcePermission(
			ListRoleResourcePermissionCondition condition, Page page) {

		if (page != null && page.isNeedTotalRecord()) {
			int totalRecord = countSysRoleResourcePermission(condition);
			page.setTotalRecord(totalRecord);
			if (totalRecord == 0) {
				PageResult<SysRoleResourcePermissionVo> result = new PageResult<SysRoleResourcePermissionVo>();
				result.setResult(new ArrayList<SysRoleResourcePermissionVo>());
				result.setPage(page);
				return result;
			}
		}

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria criteria = example
				.createCriteria();

		if (condition.id != null) {
			criteria.andIdEqualTo(condition.id);
		}

		if (condition.roleId != null) {
			criteria.andRoleIdEqualTo(condition.roleId);
		}

		if (condition.resourceId != null) {
			criteria.andResourceIdEqualTo(condition.resourceId);
		}

		if (CollectionUtils.isNotEmpty(condition.permissionIds)) {
			List<String> values = new ArrayList<String>(
					condition.permissionIds.size());
			for (Long permissionId : condition.permissionIds) {
				values.add(permissionId.toString());
			}
			criteria.andPermissionIdsIn(values);
		}

		if (page != null) {
			example.setLimitStart(page.getStart());
			example.setLimitEnd(page.getPageSize());
		}

		List<SysRoleResourcePermission> relations = sysRoleResourcePermissionMapper
				.selectByExample(example);
		PageResult<SysRoleResourcePermissionVo> result = new PageResult<SysRoleResourcePermissionVo>();
		result.setResult(TransformUtil
				.transformSysRoleResourcePermissionForQuery(relations));
		result.setPage(page);
		return result;
	}

	/**
	 * 根据条件统计SysResource列表.
	 * 
	 * @param condition
	 * @return int
	 */
	public int countSysRoleResourcePermission(
			ListRoleResourcePermissionCondition condition) {

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria criteria = example
				.createCriteria();

		if (condition.id != null) {
			criteria.andIdEqualTo(condition.id);
		}

		if (condition.roleId != null) {
			criteria.andRoleIdEqualTo(condition.roleId);
		}

		if (condition.resourceId != null) {
			criteria.andResourceIdEqualTo(condition.resourceId);
		}

		if (CollectionUtils.isNotEmpty(condition.permissionIds)) {
			List<String> values = new ArrayList<String>(
					condition.permissionIds.size());
			for (Long permissionId : condition.permissionIds) {
				values.add(permissionId.toString());
			}
			criteria.andPermissionIdsIn(values);
		}

		return sysRoleResourcePermissionMapper.countByExample(example);
	}

	/**
	 * 根据主键获取SysRoleResourcePermission.
	 *
	 * @param id
	 *            the id
	 * @return SysRoleResourcePermission
	 */
	public List<SysRoleResourcePermission> getSysRoleResourcePermissionByRoleIds(
			Set<Long> roleIds) {

		SysRoleResourcePermissionExample example = new SysRoleResourcePermissionExample();
		SysRoleResourcePermissionExample.Criteria criteria = example
				.createCriteria();
		
		if (CollectionUtils.isNotEmpty(roleIds)) {
			List<Long> values = new ArrayList<Long>(roleIds.size());
			for (Long roleId : roleIds) {
				values.add(roleId);
			}
			criteria.andRoleIdIn(values);
		}
		List<SysRoleResourcePermission> relations = sysRoleResourcePermissionMapper
				.selectByExample(example);
		logger.info(
				"getSysRoleResourcePermissionByRoleIds  roleIds:{},relation:{}",
				JSON.toJSONString(roleIds), JSON.toJSONString(relations));
		if (CollectionUtils.isNotEmpty(relations)) {
			return relations;
	   	}
		return null;
	}
}
