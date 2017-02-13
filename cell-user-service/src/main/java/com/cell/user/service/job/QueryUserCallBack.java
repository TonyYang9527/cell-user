package com.cell.user.service.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.cell.user.vo.single.RoleVo;
import com.google.common.util.concurrent.FutureCallback;

public class QueryUserCallBack implements FutureCallback<RoleVo> {

	private Logger logger = LoggerFactory.getLogger(QueryUserCallBack.class);

	private StringBuilder result = new StringBuilder();

	@Override
	public void onSuccess(RoleVo vo) {
		try {
			Thread.sleep(800);
			result.append("query user  successfully");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		logger.info("onSuccess:{}", JSON.toJSONString(vo));
	}

	@Override
	public void onFailure(Throwable throwable) {
		logger.info("onFailure:{}", JSON.toJSONString(throwable));
		result.append(throwable.toString());
	}

	public String getCallbackResult() {
		return result.toString();
	}
}
