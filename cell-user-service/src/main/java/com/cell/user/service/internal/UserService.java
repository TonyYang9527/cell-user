package com.cell.user.service.internal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.cell.user.condition.ListSysUserCondition;
import com.cell.user.dao.entiy.SysUser;
import com.cell.user.dao.entiy.SysUserExample;
import com.cell.user.dao.mapper.SysUserMapper;
import com.cell.user.ifacade.request.user.CreateSysUserReq;
import com.cell.user.ifacade.request.user.UpdateSysUserReq;

@Service("userService")
public class UserService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Resource
	protected SysUserMapper sysUserMapper;

	/**
	 * 根据主键获取SysUser.
	 *
	 * @param id
	 *            the id
	 * @return SysUser
	 */
	public SysUser getSysUserById(Long id) {
		SysUser user = sysUserMapper.selectByPrimaryKey(id);
		logger.info("getSysUserById  id:{},user:{}", JSON.toJSONString(id),
				JSON.toJSONString(user));
		if (user != null) {
			return user;
		}
		return null;
	}

	/**
	 * 创建 SysUser.
	 * 
	 * @param req
	 * @return id
	 */
	public Long createSysUser(CreateSysUserReq req) {

		SysUser user = new SysUser();
		user.setUsername(req.getUsername());
		user.setStatus(req.getStatus());
		user.setSalt(null);
		user.setPassword(req.getPassword());
		user.setMobile(req.getMobile());
		user.setEmail(req.getEmail());
		user.setDevice(req.getDevice());
		user.setDeleted(req.getDeleted());
		user.setCreatedTime(new Date());
		user.setCreatedBy("admin");
		user.setAdmin(req.getAdmin());
		sysUserMapper.insertSelective(user);
		logger.info("createSysUser  user:{}", JSON.toJSONString(user));
		// 后面加入缓存
		return user.getId();
	}

	/**
	 * 更新 SysUser
	 * 
	 * @param req
	 * @return boolean
	 */
	public boolean updateSysUser(UpdateSysUserReq req) {

		SysUser user = new SysUser();
		user.setUsername(req.getUsername());
		user.setStatus(req.getStatus());
		user.setSalt(null);
		user.setPassword(req.getPassword());
		user.setMobile(req.getMobile());
		user.setEmail(req.getEmail());
		user.setDevice(req.getDevice());
		user.setDeleted(req.getDeleted());
		user.setCreatedTime(new Date());
		user.setCreatedBy("admin");
		user.setAdmin(req.getAdmin());

		SysUserExample example = new SysUserExample();
		SysUserExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(req.getId());

		logger.info("updateSysUser  user:{}", JSON.toJSONString(user));
		sysUserMapper.updateByExampleSelective(user, example);

		return true;
	}

	/**
	 * 根据id 删除 SysUser.
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean deleteSysUserById(Long id) {

		SysUserExample example = new SysUserExample();
		SysUserExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		logger.info("deleteSysUserById  id:{}", JSON.toJSONString(id));
		sysUserMapper.deleteByExample(example);
		return true;
	}

	/**
	 * 根据条件统计SysUser列表.
	 * 
	 * @param record
	 * @return int
	 */
	public int countSysUser(ListSysUserCondition condition) {

		SysUserExample example = new SysUserExample();
		SysUserExample.Criteria criteria = example.createCriteria();

		if (StringUtils.isNotBlank(condition.username)) {
			criteria.andUsernameLike("%" + condition.username + "%");
		}

		if (condition.status != null) {
			criteria.andStatusEqualTo(condition.status);
		}

		if (CollectionUtils.isNotEmpty(condition.ids)) {
			List<Long> values = new ArrayList<Long>(condition.ids.size());
			for (Long id : condition.ids) {
				values.add(id);
			}
			criteria.andIdIn(values);
		}

		return sysUserMapper.countByExample(example);
	}
}
