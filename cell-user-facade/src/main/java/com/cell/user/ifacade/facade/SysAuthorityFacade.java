package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.authority.CreateSysAuthorityReq;
import com.cell.user.ifacade.request.authority.DeleteSysAuthorityReq;
import com.cell.user.ifacade.request.authority.GetSysAuthorityReq;
import com.cell.user.ifacade.request.authority.ListSysAuthorityReq;
import com.cell.user.ifacade.request.authority.UpdateSysAuthorityReq;
import com.cell.user.ifacade.request.authority.FindSysAuthorityReq;
import com.cell.user.ifacade.response.authority.CreateSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.DeleteSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.FindSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.GetSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.ListSysAuthorityRsp;
import com.cell.user.ifacade.response.authority.UpdateSysAuthorityRsp;

public interface SysAuthorityFacade {

	
    /**
     *创建用户授权信息
     * 
     * @param Req
     * @return
     */
    public CreateSysAuthorityRsp createSysAuthority(CreateSysAuthorityReq req);

    /**
     * 更新用户授权信息
     * 
     * @param Req
     * @return
     */
    public UpdateSysAuthorityRsp updateSysAuthority(UpdateSysAuthorityReq req);

    /**
     * 删除用户授权信息
     * 
     * @param Req
     * @return
     */
    public DeleteSysAuthorityRsp deleteSysAuthority(DeleteSysAuthorityReq req);
    

    /**
     * 查询用户授权列表
     * 
     * @param Req
     * @return
     */
    public ListSysAuthorityRsp listSysAuthority(ListSysAuthorityReq req);
    
    /**
     * 查询用户授权列表
     * 
     * @param Req
     * @return
     */
    public GetSysAuthorityRsp getSysAuthority(GetSysAuthorityReq req);
    
    
    /**
     * 查询用户授权列表
     * 
     * @param Req
     * @return
     */
    public FindSysAuthorityRsp findSysAuthorityByUserId(FindSysAuthorityReq req);
    
}
