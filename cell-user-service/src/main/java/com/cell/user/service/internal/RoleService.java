package com.cell.user.service.internal;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.condition.ListSysRoleCondition;
import com.cell.user.dao.entiy.SysRole;
import com.cell.user.dao.entiy.SysRoleExample;
import com.cell.user.dao.mapper.SysRoleMapper;
import com.cell.user.ifacade.request.role.CreateSysRoleReq;
import com.cell.user.ifacade.request.role.UpdateSysRoleReq;
import com.cell.user.page.Page;
import com.cell.user.page.PageResult;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysRoleVo;

@Service("roleService")
public class RoleService {

	private Logger logger = LoggerFactory.getLogger(RoleService.class);

	@Resource
	protected SysRoleMapper sysRoleMapper;

	/**
	 * 根据主键获取SysRole.
	 *
	 * @param id
	 *            the id
	 * @return SysRole
	 */
	public SysRole getSysRoleById(Long id) {
		SysRole role = sysRoleMapper.selectByPrimaryKey(id);
		logger.info("getSysRoleById  id:{},role:{}", JSON.toJSONString(id),
				JSON.toJSONString(role));
		if (role != null) {
			return role;
		}
		return null;
	}

	/**
	 * 创建 SysRole.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysRole(CreateSysRoleReq req) {

		SysRole role = new SysRole();
		role.setName(req.getName());
		role.setRole(req.getRole());
		role.setDisplay(req.getDisplay());
		role.setDescription(req.getDescription());
		sysRoleMapper.insertSelective(role);
		logger.info("createSysRole  role:{}", JSON.toJSONString(role));
		// 后面加入缓存
		return role.getId();
	}

	/**
	 * 更新 SysRole
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean updateSysRole(UpdateSysRoleReq req) {

		SysRole role = new SysRole();
		role.setName(req.getName());
		role.setRole(req.getRole());
		role.setDisplay(req.getDisplay());
		role.setDescription(req.getDescription());

		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(req.getId());

		logger.info("updateSysRole  role:{}", JSON.toJSONString(role));
		sysRoleMapper.updateByExampleSelective(role, example);

		return true;
	}

	/**
	 * 根据id 删除 SysRole.
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean deleteSysRoleById(Long id) {

		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		logger.info("deleteSysRoleById  id:{}", JSON.toJSONString(id));
		sysRoleMapper.deleteByExample(example);
		return true;
	}
	
	
	
	/**
	 * 根据条件 查询 SysRole列表.
	 * 
	 * @param record
	 * @return PageResult
	 */
	public PageResult<SysRoleVo> listSysRole(ListSysRoleCondition condition,
			Page page) {

		if (page != null && page.isNeedTotalRecord()) {
			int totalRecord = countSysRole(condition);
			page.setTotalRecord(totalRecord);
			if (totalRecord == 0) {
				PageResult<SysRoleVo> result = new PageResult<SysRoleVo>();
				result.setResult(new ArrayList<SysRoleVo>());
				result.setPage(page);
				return result;
			}
		}

		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();

		if (StringUtils.isNotBlank(condition.name)) {
			criteria.andNameLike("%" + condition.name + "%");
		}

		if (StringUtils.isNotBlank(condition.role)) {
			criteria.andRoleLike("%" + condition.role + "%");
		}

		if (page != null) {
			example.setLimitStart(page.getStart());
			example.setLimitEnd(page.getPageSize());
		}

		List<SysRole> roles = sysRoleMapper.selectByExample(example);
		PageResult<SysRoleVo> result = new PageResult<SysRoleVo>();
		result.setResult(TransformUtil.transformSysRoleForQuery(roles));
		result.setPage(page);
		return result;
	}

	

	/**
	 * 根据条件统计SysRole列表.
	 * 
	 * @param record
	 * @return int
	 */
	public int countSysRole(ListSysRoleCondition condition) {

		SysRoleExample example = new SysRoleExample();
		SysRoleExample.Criteria criteria = example.createCriteria();

		if (StringUtils.isNotBlank(condition.name)) {
			criteria.andNameLike("%" + condition.name + "%");
		}

		if (StringUtils.isNotBlank(condition.role)) {
			criteria.andRoleLike("%" + condition.role + "%");
		}

		return sysRoleMapper.countByExample(example);
	}
}
