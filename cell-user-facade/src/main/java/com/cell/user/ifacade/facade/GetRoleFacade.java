package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.GetRoleReq;
import com.cell.user.ifacade.response.GetRoleRsp;

public interface GetRoleFacade {

    public GetRoleRsp getRole(GetRoleReq req);
}
