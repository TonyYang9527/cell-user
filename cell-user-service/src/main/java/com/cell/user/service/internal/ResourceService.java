package com.cell.user.service.internal;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysResource;
import com.cell.user.dao.mapper.SysResourceMapper;
import com.cell.user.ifacade.request.resource.CreateSysResourceReq;

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
	public  SysResource getSysResourceById(Long id) {
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

	
}
