package com.kys;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonView;
import com.hdx.biz.service.sysparam.SysparamOfMysqlService;
import com.hdx.common.utils.JsonResult;
import com.hdx.model.SysparamModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/param")
@Api("系统参数接口")
public class ParamController {
    
	@Autowired
	private SysparamOfMysqlService sysparamOfMysqlService;
	
	@RequestMapping(value = "/getParamValue",method = RequestMethod.GET)
	@ApiOperation(value="查询系统参数值", notes="查询系统参数值")
    //@ApiImplicitParam(name = "", value = "用户ID")
	@JsonView(SysparamModel.class)
    public  String getParamValue() throws Exception {
	   JsonResult jsonResult =  sysparamOfMysqlService.testServer(new HashMap<String,Object>());
       return JSON.toJSONString(jsonResult);
    }

}
