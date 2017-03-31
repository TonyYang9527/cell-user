package com.cell.user.ifacade.request.resource;

import com.cell.user.ifacade.request.BaseRequest;

public class CreateSysResourceReq extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2328881068592932792L;

	
    private String name;


    private String identity;

  
    private String url;

   
    private Long parentId;

 
    private String parentIds;

  
    private String icon;

 
    private Integer weight;

  
    private Boolean display;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdentity() {
		return identity;
	}


	public void setIdentity(String identity) {
		this.identity = identity;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Long getParentId() {
		return parentId;
	}


	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}


	public String getParentIds() {
		return parentIds;
	}


	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}


	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public Integer getWeight() {
		return weight;
	}


	public void setWeight(Integer weight) {
		this.weight = weight;
	}


	public Boolean getDisplay() {
		return display;
	}


	public void setDisplay(Boolean display) {
		this.display = display;
	}
    
    
}
