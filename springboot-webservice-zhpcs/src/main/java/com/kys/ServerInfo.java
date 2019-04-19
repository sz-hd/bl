package com.kys;

import java.util.Map;

public class ServerInfo {
	private String name;
	private String url;
	private String swagger;
	private Map<String,Object> serviceList;
	private String version;
	
	public ServerInfo(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSwagger() {
		return swagger;
	}
	public void setSwagger(String swagger) {
		this.swagger = swagger;
	}
	public Map<String, Object> getServiceList() {
		return serviceList;
	}
	public void setServiceList(Map<String, Object> serviceList) {
		this.serviceList = serviceList;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
	
}
