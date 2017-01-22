package com.cell.user.ifacade.response;

import java.io.Serializable;

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = -8762087880206050469L;

	protected String retCode;
	protected String retMsg;

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
}
