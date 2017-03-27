package com.cell.user.service.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.Role;
import com.cell.user.dao.mapper.RoleMapper;
import com.cell.user.ifacade.facade.GetRoleFacade;
import com.cell.user.ifacade.request.GetRoleReq;
import com.cell.user.ifacade.response.GetRoleRsp;
import com.cell.user.vo.single.RoleVo;

@Service("getRoleService")
public class GetRoleService implements GetRoleFacade {

    private Logger logger = LoggerFactory.getLogger(GetRoleService.class);

    @Autowired
    protected RoleMapper roleMapper;

    @Override
    public GetRoleRsp getRole(GetRoleReq req) {

        GetRoleRsp rsp = new GetRoleRsp();
        Role role = roleMapper.selectByPrimaryKey(req.getId());
        RoleVo vo = new RoleVo();
        BeanUtils.copyProperties(role, vo);
        rsp.setRole(vo);
        rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
        rsp.setRetMsg(Constants.SUCCESS);
        logger.info("req:{},rsp:{}", req, rsp);
        return rsp;
    }
}
