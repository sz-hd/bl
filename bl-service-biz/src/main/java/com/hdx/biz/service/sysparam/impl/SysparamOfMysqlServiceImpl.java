/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.hdx.biz.service.sysparam.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hdx.biz.service.sysparam.SysparamOfMysqlService;
import com.hdx.common.utils.JsonResult;

@Service
public class SysparamOfMysqlServiceImpl implements SysparamOfMysqlService {

	@Override
	public JsonResult insert(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult update(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult delete(Map<String, Object> parameter) throws Exception {
		return null;
	}

	@Override
	public JsonResult testServer(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name","paranName");
		map.put("value","1");
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}
	
	@Override
	public JsonResult testCaseServer(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name","paranName");
		map.put("value","case");
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}
	
	@Override
	public JsonResult testXtglServer(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name","paranName");
		map.put("value","xtgl");
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult testZdryServer(Map<String, Object> parameter) throws Exception {
		JsonResult jsonResult = new JsonResult();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name","paranName");
		map.put("value","zdry");
		jsonResult.setData(map);
		jsonResult.setSuccess(true);
		return jsonResult;
	}

	@Override
	public JsonResult query(Map<String, Object> arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonResult queryNavigator(Map<String, Object> arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
