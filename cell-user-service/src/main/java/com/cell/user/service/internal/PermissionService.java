package com.cell.user.service.internal;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.condition.ListSysPermissionCondition;
import com.cell.user.dao.entiy.SysPermission;
import com.cell.user.dao.entiy.SysPermissionExample;
import com.cell.user.dao.mapper.SysPermissionMapper;
import com.cell.user.ifacade.request.permission.CreateSysPermissionReq;
import com.cell.user.ifacade.request.permission.UpdateSysPermissionReq;
import com.cell.user.page.Page;
import com.cell.user.page.PageResult;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysPermissionVo;

@Service("permissionService")
public class PermissionService {

	private Logger logger = LoggerFactory.getLogger(PermissionService.class);

	@Resource
	protected SysPermissionMapper sysPermissionMapper;

	/**
	 * 根据主键获取SysPermission.
	 *
	 * @param id
	 *            the id
	 * @return SysPermission
	 */
	public SysPermission getSysPermissionById(Long id) {
		SysPermission permission = sysPermissionMapper.selectByPrimaryKey(id);
		logger.info("getSysAuthorityById  id:{},authority:{}",
				JSON.toJSONString(id), JSON.toJSONString(permission));
		if (permission != null) {
			return permission;
		}
		return null;
	}

	/**
	 * 创建 SysPermission.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysPermission(CreateSysPermissionReq req) {

		SysPermission permission = new SysPermission();
		permission.setName(req.getName());
		permission.setPermission(req.getPermission());
		permission.setDescription(req.getDescription());
		permission.setDisplay(req.getDisplay());
		sysPermissionMapper.insertSelective(permission);
		logger.info("createSysAuthority  authority:{}",
				JSON.toJSONString(permission));
		// 后面加入缓存
		return permission.getId();
	}

	/**
	 * 更新 SysPermission
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean updateSysPermission(UpdateSysPermissionReq req) {

		SysPermission permission = new SysPermission();

		permission.setName(req.getName());
		permission.setPermission(req.getPermission());
		permission.setDescription(req.getDescription());
		permission.setDisplay(req.getDisplay());

		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(req.getId());

		logger.info("updateSysPermission  permission:{}",
				JSON.toJSONString(permission));
		sysPermissionMapper.updateByExampleSelective(permission, example);

		return true;
	}

	/**
	 * 根据id 删除 SysPermission.
	 * 
	 * @param sysPermissionId
	 * @return boolean
	 */
	public boolean deleteSysPermissionById(Long sysPermissionId) {

		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(sysPermissionId);
		logger.info("deleteSysAuthorityById  sysAuthorityId:{}",
				JSON.toJSONString(sysPermissionId));
		sysPermissionMapper.deleteByExample(example);
		return true;
	}

	/**
	 * 根据条件 查询 SysAuthority列表.
	 * 
	 * @param record
	 * @return int
	 */
	public PageResult<SysPermissionVo> listSysPermission(
			ListSysPermissionCondition condition, Page page) {

		if (page != null && page.isNeedTotalRecord()) {
			int totalRecord = countSysPermission(condition);
			page.setTotalRecord(totalRecord);
			if (totalRecord == 0) {
				PageResult<SysPermissionVo> result = new PageResult<SysPermissionVo>();
				result.setResult(new ArrayList<SysPermissionVo>());
				result.setPage(page);
				return result;
			}
		}

		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria criteria = example.createCriteria();

		if (StringUtils.isNotBlank(condition.name)) {
			criteria.andNameLike("%" + condition.name + "%");
		}

		if (StringUtils.isNotBlank(condition.permission)) {
			criteria.andPermissionLike("%" + condition.permission + "%");
		}

		if (page != null) {
			example.setLimitStart(page.getStart());
			example.setLimitEnd(page.getPageSize());
		}

		List<SysPermission> permissions = sysPermissionMapper
				.selectByExample(example);
		permissions.size();
		PageResult<SysPermissionVo> result = new PageResult<SysPermissionVo>();
		result.setResult(TransformUtil
				.transformSysPermissionForQuery(permissions));
		result.setPage(page);
		return result;
	}

	/**
	 * 根据条件统计SysPermission列表.
	 * 
	 * @param record
	 * @return int
	 */
	public int countSysPermission(ListSysPermissionCondition condition) {

		SysPermissionExample example = new SysPermissionExample();
		SysPermissionExample.Criteria criteria = example.createCriteria();

		if (StringUtils.isNotBlank(condition.name)) {
			criteria.andNameLike("%" + condition.name + "%");
		}

		if (StringUtils.isNotBlank(condition.permission)) {
			criteria.andPermissionLike("%" + condition.permission + "%");
		}
		return sysPermissionMapper.countByExample(example);
	}
}
