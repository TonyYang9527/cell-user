package com.cell.user.service.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.cell.user.vo.single.RoleVo;
import com.google.common.util.concurrent.FutureCallback;

public class QueryTaskCallBack implements FutureCallback<RoleVo> {

	private Logger logger = LoggerFactory.getLogger(QueryTaskCallBack.class);

	private StringBuilder result = new StringBuilder();

	// 消费接口
	@Override
	public void onSuccess(RoleVo vo) {
		try {
			Thread.sleep(1800);
			result.append(" successfully");
		} catch (Throwable e) {
		}
		logger.info("onSuccess:{}", JSON.toJSONString(vo));
	}

	// 回归接口
	@Override
	public void onFailure(Throwable throwable) {
		logger.info("onFailure:{}", JSON.toJSONString(throwable));
		result.append(throwable.toString());
	}

	public String getCallbackResult() {
		return result.toString();
	}

}
