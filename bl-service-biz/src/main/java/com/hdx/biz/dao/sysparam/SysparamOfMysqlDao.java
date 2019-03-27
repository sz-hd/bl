/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.hdx.biz.dao.sysparam;

import java.util.List;

import com.hdx.common.dao.BaseDao;

/**
 * 
 * 系统参数数据接口.<br>
 * @author yswh <br>
 * @version 1.0.0 2018年6月20日<br>
 * @see 
 * @since JDK 1.8
 */
public interface SysparamOfMysqlDao extends BaseDao {
	/**
	 * 获取系统参数
	 * @return
	 * @throws Exception
	 */
	List<Object> queryParamValue() throws Exception;
	/**
	 * 根据key和name获取 系统参数值
	 * @param paramkey
	 * @param paramName
	 * @return
	 * @throws Exception
	 */
	String getParamVal(String paramkey,String paramName) throws Exception;
}
