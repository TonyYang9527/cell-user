package com.cell.user.ifacade.response.relation;

import java.util.List;

import com.cell.user.ifacade.response.BaseResponse;
import com.cell.user.vo.single.SysRoleResourcePermissionVo;

public class FindRoleResourcePermissionRsp  extends BaseResponse{

	private static final long serialVersionUID = 9176077762290005356L;

	  protected List<SysRoleResourcePermissionVo> relations;

	public List<SysRoleResourcePermissionVo> getRelations() {
		return relations;
	}

	public void setRelations(List<SysRoleResourcePermissionVo> relations) {
		this.relations = relations;
	}
	  
	  
}
