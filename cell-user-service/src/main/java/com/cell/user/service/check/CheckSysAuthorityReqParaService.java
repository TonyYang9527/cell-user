package com.cell.user.service.check;

import org.springframework.stereotype.Component;

import com.cell.user.constant.Constants;
import com.cell.user.ifacade.request.authority.CreateSysAuthorityReq;
import com.cell.user.ifacade.response.authority.CreateSysAuthorityRsp;

@Component
public class CheckSysAuthorityReqParaService extends CheckReqParamsService {

	/**
	 * 校验创建活动请求参数.
	 *
	 * @param req
	 * @return 错误信息，如果正确，则没有内容
	 */
	public CreateSysAuthorityRsp checkCreateActivityReq(
			CreateSysAuthorityReq req) {
		StringBuilder errorMsg = new StringBuilder();
		CreateSysAuthorityRsp resp = new CreateSysAuthorityRsp();
		if (req == null)
			errorMsg.append("请求为空,");
		try {
		//	checkRoleIds(req.getRoleIds());
		} catch (Exception e) {
			errorMsg.append(e.getMessage() + ",");
		}

		String result = errorMsg.toString();
		if (errorMsg.length() > 0) {
			result = errorMsg.substring(0, errorMsg.length() - 1);
		}

		if (result.length() > 0) {
			resp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			resp.setRetMsg(result);
		} else {
			resp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			resp.setRetMsg("参数检查成功");
		}
		return resp;
	}
}
