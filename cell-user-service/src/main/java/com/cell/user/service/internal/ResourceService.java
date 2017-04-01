package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.condition.ListSysPermissionCondition;
import com.cell.user.condition.ListSysResourceCondition;
import com.cell.user.dao.entiy.SysPermissionExample;
import com.cell.user.dao.entiy.SysResource;
import com.cell.user.dao.entiy.SysResourceExample;
import com.cell.user.dao.mapper.SysResourceMapper;
import com.cell.user.ifacade.request.resource.CreateSysResourceReq;
import com.cell.user.ifacade.request.resource.UpdateSysResourceReq;

@Service("resourceService")
public class ResourceService {

	private Logger logger = LoggerFactory.getLogger(ResourceService.class);

	@Resource
	protected SysResourceMapper sysResourceMapper;

	/**
	 * 根据主键获取SysResource.
	 *
	 * @param id
	 *            the id
	 * @return SysResource
	 */
	public SysResource getSysResourceById(Long id) {
		SysResource resource = sysResourceMapper.selectByPrimaryKey(id);
		logger.info("getSysResourceById  id:{},resource:{}",
				JSON.toJSONString(id), JSON.toJSONString(resource));
		if (resource != null) {
			return resource;
		}
		return null;
	}

	/**
	 * 创建 SysResource.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysResource(CreateSysResourceReq req) {

		SysResource resource = new SysResource();
		resource.setIdentity(req.getIdentity());
		resource.setName(req.getName());
		resource.setParentId(req.getParentId());
		resource.setParentIds(req.getParentIds());
		resource.setUrl(req.getUrl());
		resource.setWeight(req.getWeight());
		resource.setIcon(req.getIcon());
		resource.setDisplay(req.getDisplay());

		sysResourceMapper.insertSelective(resource);
		logger.info("createSysResource  resource:{}",
				JSON.toJSONString(resource));
		// 后面加入缓存
		return resource.getId();
	}

	/**
	 * 更新 SysResource
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean updateSysResource(UpdateSysResourceReq req) {

		SysResource resource = new SysResource();

		resource.setIdentity(req.getIdentity());
		resource.setName(req.getName());
		resource.setParentId(req.getParentId());
		resource.setParentIds(req.getParentIds());
		resource.setUrl(req.getUrl());
		resource.setWeight(req.getWeight());
		resource.setIcon(req.getIcon());
		resource.setDisplay(req.getDisplay());

		SysResourceExample example = new SysResourceExample();
		SysResourceExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(req.getId());

		logger.info("updateSysResource  resource:{}",
				JSON.toJSONString(resource));
		sysResourceMapper.updateByExampleSelective(resource, example);

		return true;
	}

	
	/**
	 * 根据id 删除 SysResource.
	 * 
	 * @param sysPermissionId
	 * @return boolean
	 */
	public boolean deleteSysResourceById(Long id) {

		SysResourceExample example = new SysResourceExample();
		SysResourceExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		logger.info("deleteSysResourceById  sysAuthorityId:{}",
				JSON.toJSONString(id));
		sysResourceMapper.deleteByExample(example);
		return true;
	}
	
	
	/**
	 * 根据条件统计SysResource列表.
	 * 
	 * @param record
	 * @return int
	 */
	public int countSysResource(ListSysResourceCondition condition) {

		SysResourceExample example = new SysResourceExample();
		SysResourceExample.Criteria criteria = example.createCriteria();

		if (StringUtils.isNotBlank(condition.name)) {
			criteria.andNameLike("%" + condition.name + "%");
		}

		if (StringUtils.isNotBlank(condition.identity)) {
			criteria.andIdentityLike("%" + condition.identity + "%");
		}
		

		if (StringUtils.isNotBlank(condition.url)) {
			criteria.andUrlLike("%" + condition.url + "%");
		}
		return sysResourceMapper.countByExample(example);
	}
}
