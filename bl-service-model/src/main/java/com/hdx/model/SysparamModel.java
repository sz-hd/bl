package com.hdx.model;

import com.hdx.model.BaseObject;
import com.hdx.model.Column;
import com.hdx.model.Table;

@Table(name="BL_SYSPARAM")
public class SysparamModel extends BaseObject {
	private static final long serialVersionUID = 3785465190409274449L;
	@Column(name="ID",isId="true")
	private Integer id;
	@Column(name="PARAMKEY")
	private String paramKey;
	@Column(name="PARAMNAME")
	private String paramName;
	@Column(name="PARAMVALUE")
	private String paramValue;
	@Column(name="REMARK")
	private String remark;
	@Column(name="STATUS")
	private Integer status;
	@Column(name="UPDATEDATE")
	private Integer updatedate;
	
	public SysparamModel(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getParamKey() {
		return paramKey;
	}

	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Integer updatedate) {
		this.updatedate = updatedate;
	}

	
	
}
