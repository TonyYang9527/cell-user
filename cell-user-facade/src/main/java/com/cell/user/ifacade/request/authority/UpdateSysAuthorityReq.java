package com.cell.user.ifacade.request.authority;

import java.util.Date;

import com.cell.user.ifacade.request.BaseRequest;

public class UpdateSysAuthorityReq extends BaseRequest{


	private static final long serialVersionUID = -3635553154866737026L;

	 /*
     * 活动ID
     */
    private Long id;

    /*
     * 活动名字
     */
    private String name;

    /*
     * 起始时间
     */
    private Date startTime;

    /*
     * 结束时间
     */
    private Date endTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


}
