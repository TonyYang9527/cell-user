package com.cell.user.service.job;

import java.util.Date;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.cell.user.vo.single.RoleVo;

public class QueryUserTask implements Callable<RoleVo> {

	private Logger logger = LoggerFactory.getLogger(QueryUserTask.class);

	@Override
	public RoleVo call() throws Exception {
		RoleVo vo = new RoleVo();
		vo.setCreatedTime(new Date());
		vo.setCreatedBy("scott");
		System.out.println("QueryUserTask vo :" + JSON.toJSONString(vo));
		logger.info("QueryUserTaskCall:{}", JSON.toJSONString(vo));
		return vo;
	}

}
