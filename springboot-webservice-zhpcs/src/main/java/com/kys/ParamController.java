package com.kys;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonView;
import com.hdx.biz.service.sysparam.SysparamOfMysqlService;
import com.hdx.model.SysparamModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/zhpcs")
@Api("应用服务组件")
@Configuration
@PropertySource(value = {"classpath:application.yml"})
@ConfigurationProperties(prefix="server")
public class ParamController {
	
	private List<ServerInfo> service;

	public List<ServerInfo> getService() {
		return service;
	}

	public void setService(List<ServerInfo> service) {
		this.service = service;
	}
	
	private String getCaseService() {
		ServerInfo service = getServiceByName("case");
		Map<String,Object> map = service.getServiceList();
		@SuppressWarnings("unchecked")
		Map<String,Object> map2 = (Map<String,Object>)map.get("demo");
		JSONObject object = HttpsUtils.doGet(service.getUrl()+map2.get("addr"));
		if (object!=null) {
			JSONObject k = object.getJSONObject("data");
			return k.getString("value");
		}
		return "";
	}
	
	private String getXtglService() {
		ServerInfo service = getServiceByName("xtgl");
		Map<String,Object> map = service.getServiceList();
		@SuppressWarnings("unchecked")
		Map<String,Object> map2 = (Map<String,Object>)map.get("demo");
		JSONObject object = HttpsUtils.doGet(service.getUrl()+map2.get("addr"));
		if (object!=null) {
			JSONObject k = object.getJSONObject("data");
			return k.getString("value");
		}
		return "";
	}
	
	private String getZdryService() {
		ServerInfo service = getServiceByName("zdry");
		Map<String,Object> map = service.getServiceList();
		@SuppressWarnings("unchecked")
		Map<String,Object> map2 = (Map<String,Object>)map.get("demo");
		JSONObject object = HttpsUtils.doGet(service.getUrl()+map2.get("addr"));
		if (object!=null) {
			JSONObject k = object.getJSONObject("data");
			return k.getString("value");
		}
		return "";
	}
    
	private ServerInfo getServiceByName(String name) {
		for(ServerInfo info: service) {
			if (info.getName().equals(name)) {
				return info;
			}
		}
		return null;
	}
	
	@RequestMapping(value = "/getValue",method = RequestMethod.GET)
	@ApiOperation(value="查询系统参数值", notes="查询系统参数值")
	@JsonView(SysparamModel.class)
    public  String getParamValue() throws Exception {
	   String caseName = getCaseService();
	   String xtglName = getXtglService();
	   String zdry = getZdryService();
       return "hello k8s,["+caseName+","+xtglName+","+zdry+"]";
    }
	

}
