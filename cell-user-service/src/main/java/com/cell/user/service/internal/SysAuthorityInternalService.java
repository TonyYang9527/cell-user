package com.cell.user.service.internal;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cell.user.dao.entiy.SysAuthority;
import com.cell.user.dao.entiy.SysAuthorityExample;
import com.cell.user.dao.mapper.SysAuthorityMapper;
import com.cell.user.page.PageResult;
import com.cell.user.vo.single.SysAuthorityVo;

@Service("sysAuthorityInternalService")
public class SysAuthorityInternalService {

	private Logger logger = LoggerFactory
			.getLogger(SysAuthorityInternalService.class);
	
	@Resource
	protected SysAuthorityMapper sysAuthorityMapper;

	/**
	 * 根据主键获取SysAuthority.
	 *
	 * @param id
	 *            the id
	 * @return SysAuthority
	 */
	public SysAuthority getSysAuthorityById(Long id) {

		SysAuthority  authority = sysAuthorityMapper.selectByPrimaryKey(id);
		logger.info("getSysAuthorityById  id:{},authority:{}", JSON.toJSONString(id),  JSON.toJSONString(authority));
		if (authority != null) {
			return authority;
		}
		return null;
	}

	/**
	 * 创建 SysAuthority.
	 * 
	 * @param vo
	 * @return id
	 */
	public long createSysAuthority(SysAuthorityVo vo) {
		SysAuthority authority = new SysAuthority();
		authority.setId(null);
		sysAuthorityMapper.insertSelective(authority);
		return authority.getId();
	}

	/**
	 * 更新 SysAuthority.
	 * 
	 * @param activity
	 * @return
	 */
	public boolean updateSysAuthority(SysAuthorityVo vo) {
		SysAuthority authority = new SysAuthority();
		SysAuthorityExample example = new SysAuthorityExample();
		SysAuthorityExample.Criteria c = example.createCriteria();
		c.andIdEqualTo(authority.getId());

		sysAuthorityMapper.updateByExampleSelective(authority, example);
		return true;
	}

	/**
	 * 根据id 删除 SysAuthority.
	 * 
	 * @param id
	 * @return int
	 */
	public boolean deleteSysAuthority(long sysAuthorityId, String deletedBy,
			List<Byte> inStates) {

		SysAuthority activity = new SysAuthority();

		SysAuthorityExample example = new SysAuthorityExample();
		SysAuthorityExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(sysAuthorityId);
		sysAuthorityMapper.deleteByExample(example);
		return true;
	}

	/**
	 * 根据条件 查询 SysAuthority列表.
	 * 
	 * @param record
	 * @return int
	 */
	public PageResult<SysAuthorityVo> listSysAuthority() {

		SysAuthorityExample example = new SysAuthorityExample();
		SysAuthorityExample.Criteria criteria = example.createCriteria();
		List<SysAuthority> list = sysAuthorityMapper.selectByExample(example);

		PageResult<SysAuthorityVo> result = new PageResult<SysAuthorityVo>();
		result.setResult(null);
		result.setPage(null);
		return result;
	}

	/**
	 * 根据条件统计SysAuthority列表.
	 * 
	 * @param record
	 * @return int
	 */
	public int countSysAuthority() {

		SysAuthorityExample example = new SysAuthorityExample();
		SysAuthorityExample.Criteria criteria = example.createCriteria();

		return sysAuthorityMapper.countByExample(example);
	}

	/**
	 * 根据主键获取SysAuthority相关信息
	 *
	 * @param id
	 *            the id
	 * @return SysAuthorityVo
	 */
	public SysAuthorityVo querySysAuthorityById(Long id) {
		SysAuthority authority = getSysAuthorityById(id);
		SysAuthorityVo vo = new SysAuthorityVo();
		return vo;
	}

	public boolean checkSysAuthorityState(List<Byte> inStates) {
		return false;
	}

}
