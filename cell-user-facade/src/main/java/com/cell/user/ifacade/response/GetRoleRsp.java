package com.cell.user.ifacade.response;

import com.cell.user.vo.single.RoleVo;

public class GetRoleRsp extends BaseResponse {

    private static final long serialVersionUID = 171146473959140054L;

    private RoleVo role;

    public RoleVo getRole() {
        return role;
    }

    public void setRole(RoleVo role) {
        this.role = role;
    }

}
