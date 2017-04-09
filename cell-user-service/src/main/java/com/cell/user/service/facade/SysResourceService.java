package com.cell.user.service.facade;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.cell.user.constant.Constants;
import com.cell.user.dao.entiy.SysResource;
import com.cell.user.ifacade.facade.SysResourceFacade;
import com.cell.user.ifacade.request.resource.CreateSysResourceReq;
import com.cell.user.ifacade.request.resource.DeleteSysResourceReq;
import com.cell.user.ifacade.request.resource.FindSysResourceReq;
import com.cell.user.ifacade.request.resource.GetSysResourceReq;
import com.cell.user.ifacade.request.resource.ListSysResourceReq;
import com.cell.user.ifacade.request.resource.UpdateSysResourceReq;
import com.cell.user.ifacade.response.resource.CreateSysResourceRsp;
import com.cell.user.ifacade.response.resource.DeleteSysResourceRsp;
import com.cell.user.ifacade.response.resource.FindSysResourceRsp;
import com.cell.user.ifacade.response.resource.GetSysResourceRsp;
import com.cell.user.ifacade.response.resource.ListSysResourceRsp;
import com.cell.user.ifacade.response.resource.UpdateSysResourceRsp;
import com.cell.user.page.PageResult;
import com.cell.user.service.internal.ResourceService;
import com.cell.user.service.util.TransformUtil;
import com.cell.user.vo.single.SysResourceVo;

@Service("sysResourceService")
public class SysResourceService implements SysResourceFacade {

	private Logger logger = LoggerFactory.getLogger(SysResourceService.class);

	@Resource
	protected ResourceService resourceService;

	@Override
	public CreateSysResourceRsp createSysResource(CreateSysResourceReq req) {

		CreateSysResourceRsp rsp = new CreateSysResourceRsp();
		Long id = resourceService.createSysResource(req);
		if (id > 0) {
			rsp.setId(id);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("创建资源成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("创建资源失败");
		}
		logger.info("createSysResource req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public UpdateSysResourceRsp updateSysResource(UpdateSysResourceReq req) {

		UpdateSysResourceRsp rsp = new UpdateSysResourceRsp();
		// 添加校验
		SysResource old = resourceService.getSysResourceById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新资源失败");
			return rsp;
		}

		boolean retValue = resourceService.updateSysResource(req);
		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("更新资源成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("更新资源失败");
		}
		logger.info("updateSysResource req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public DeleteSysResourceRsp deleteSysResource(DeleteSysResourceReq req) {
		DeleteSysResourceRsp rsp = new DeleteSysResourceRsp();
		// 添加校验
		SysResource old = resourceService.getSysResourceById(req.getId());
		if (old == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除资源失败");
			return rsp;
		}
		boolean retValue = resourceService.deleteSysResourceById(req.getId());

		if (retValue) {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("删除资源成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("删除资源失败");
		}
		logger.info("deleteSysResource req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public ListSysResourceRsp listSysResource(ListSysResourceReq req) {
		ListSysResourceRsp rsp = new ListSysResourceRsp();
		// 添加校验
		if (req.getCondition() != null) {
			PageResult<SysResourceVo> result = resourceService.listSysResource(
					req.getCondition(), req.getPage());
			rsp.setResult(result);
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("分页查询资源成功");
		} else {
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询条件为空");
		}
		logger.info("listSysResource req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public GetSysResourceRsp getSysResource(GetSysResourceReq req) {
		GetSysResourceRsp rsp = new GetSysResourceRsp();
		// 添加校验
		SysResource resouce = resourceService.getSysResourceById(req.getId());
		if (resouce == null) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取资源失败");
			return rsp;
		} else {
			rsp.setResource(TransformUtil
					.transformSysResourceVoForQuery(resouce));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询资源成功");
		}
		logger.info("getSysResource req:{},rsp:{}", req, rsp);
		return rsp;
	}

	@Override
	public FindSysResourceRsp findSysResources(FindSysResourceReq req) {
		FindSysResourceRsp rsp = new FindSysResourceRsp();
		// 添加校验
		List<SysResource> resources = resourceService.findSysResources(req.getIds(),req.getParentIds());
		if (CollectionUtils.isEmpty(resources)) {
			rsp.setRetCode(Constants.RESPONSE_FAIL_CODE);
			rsp.setRetMsg("获取资源失败");
			return rsp;
		} else {
			rsp.setResources(TransformUtil.transformSysResourceForQuery(resources));
			rsp.setRetCode(Constants.RESPONSE_SUCCESS_CODE);
			rsp.setRetMsg("查询资源成功");
		}
		logger.info("findSysResources req:{},rsp:{}", req, rsp);
		return rsp;
	}

}
