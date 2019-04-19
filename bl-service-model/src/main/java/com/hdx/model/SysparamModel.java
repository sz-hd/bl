package com.hdx.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Table(name="BL_SYSPARAM")
@ApiModel
public class SysparamModel extends BaseObject {
	private static final long serialVersionUID = 3785465190409274449L;
	@ApiModelProperty(value="Id",name="Id")
	@Column(name="ID",isId="true")
	private Integer id;
	@ApiModelProperty(value="参数key",name="paramKey")
	@Column(name="PARAMKEY")
	private String paramKey;
	@ApiModelProperty(value="参数名称",name="paramName")
	@Column(name="PARAMNAME")
	private String paramName;
	@ApiModelProperty(value="参数值",name="paramValue")
	@Column(name="PARAMVALUE")
	private String paramValue;
	@ApiModelProperty(value="注释",name="remark")
	@Column(name="REMARK")
	private String remark;
	@ApiModelProperty(value="参数状态",name="status")
	@Column(name="STATUS")
	private Integer status;
	@ApiModelProperty(value="时间",name="updatedate")
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
