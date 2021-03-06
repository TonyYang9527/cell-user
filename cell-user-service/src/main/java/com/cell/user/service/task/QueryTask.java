package com.cell.user.service.task;

import java.util.Date;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.cell.user.vo.single.RoleVo;

public class QueryTask implements Callable<RoleVo> {

	private Logger logger = LoggerFactory.getLogger(QueryTask.class);

	@Override
	public RoleVo call() throws Exception {
		RoleVo vo = new RoleVo();
		vo.setCreatedTime(new Date());
		vo.setCreatedBy("admin");
		System.out.println("QueryJob vo :" +JSON.toJSONString(vo));
		logger.info(" QueryTaskCall :{}", JSON.toJSONString(vo));
		return vo;
	}
}
