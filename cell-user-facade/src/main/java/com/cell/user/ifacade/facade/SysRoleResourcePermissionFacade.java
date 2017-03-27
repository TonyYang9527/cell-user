package com.cell.user.ifacade.facade;

import com.cell.user.ifacade.request.relation.CreateRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.DeleteRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.GetRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.ListRoleResourcePermissionReq;
import com.cell.user.ifacade.request.relation.UpdateRoleResourcePermissionReq;
import com.cell.user.ifacade.response.relation.CreateRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.DeleteRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.GetRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.ListRoleResourcePermissionRsp;
import com.cell.user.ifacade.response.relation.UpdateRoleResourcePermissionRsp;


public interface SysRoleResourcePermissionFacade {

	
    /**
     *创建角色资源权限关联信息
     * 
     * @param Req
     * @return
     */
    public CreateRoleResourcePermissionRsp createRoleResourcePermission(CreateRoleResourcePermissionReq req);

    /**
     * 更新角色资源权限关联信息
     * 
     * @param Req
     * @return
     */
    public UpdateRoleResourcePermissionRsp updateRoleResourcePermission(UpdateRoleResourcePermissionReq req);

    /**
     * 删除角色资源权限关联信息
     * 
     * @param Req
     * @return
     */
    public DeleteRoleResourcePermissionRsp deleteRoleResourcePermission(DeleteRoleResourcePermissionReq req);
    

    /**
     * 查询角色资源权限关联列表
     * 
     * @param Req
     * @return
     */
    public ListRoleResourcePermissionRsp listRoleResourcePermission(ListRoleResourcePermissionReq req);
    
    /**
     * 查询角色资源权限关联列表
     * 
     * @param Req
     * @return
     */
    public GetRoleResourcePermissionRsp getRoleResourcePermission(GetRoleResourcePermissionReq req);
    
}
