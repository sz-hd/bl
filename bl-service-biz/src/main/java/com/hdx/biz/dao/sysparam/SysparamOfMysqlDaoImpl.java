/*
 * Copyright 2018-2028 Twis.Inc All Rights Reserved.
 */
package com.hdx.biz.dao.sysparam;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hdx.common.dao.impl.BaseExDaoOfMysqlImpl;
import com.hdx.model.SysparamModel;

/**
 * 
 * 系统参数数据实现类.<br>
 * @author yswh <br>
 * @version 1.0.0 2018年6月20日<br>
 * @see 
 * @since JDK 1.8
 */
@Repository
public class SysparamOfMysqlDaoImpl extends BaseExDaoOfMysqlImpl<SysparamModel> implements SysparamOfMysqlDao {

	@Override
	public List<Object> queryParamValue() throws Exception {
		String sql = "select * from bl_sysparam where status = 1";
		return this.query(sql, new Object[]{}, SysparamModel.class);
		
	}

	@Override
	public String getParamVal(String paramkey, String paramName) throws Exception {
		String sql = "select paramvalue from bl_sysparam where paramkey=? and paramname=? and status=1";
		return this.getFirstValueByArgs(sql, new Object[]{paramkey,paramName}, "");
	}

}
