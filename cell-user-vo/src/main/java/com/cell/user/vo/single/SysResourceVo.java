package com.cell.user.vo.single;

import java.io.Serializable;

public class SysResourceVo  implements Serializable{
 
	private static final long serialVersionUID = -8520919471353969555L;


    private Long id;


    private String name;


    private String identity;

  
    private String url;

   
    private Long parentId;

 
    private String parentIds;

  
    private String icon;

 
    private Integer weight;

  
    private Boolean display;


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
        this.name = name == null ? null : name.trim();
    }


    public String getIdentity() {
        return identity;
    }


    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

 
    public String getIcon() {
        return icon;
    }


    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
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