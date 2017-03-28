package com.cell.user.service.check;

import com.google.common.base.Preconditions;

public class CheckReqParamsService {
    /**
     * 校验ID
     */
    public void checkId(Long id) {
        Preconditions.checkNotNull(id, "ID不存在");
    }
    
    /**
     * 校验ID
     */
    public void checkRoleIds(String roleIds) {
        Preconditions.checkNotNull(roleIds, "roleIds不能为空");
    }

}
