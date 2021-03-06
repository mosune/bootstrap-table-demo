package com.bootstrap.entity;

import java.io.Serializable;

import java.lang.String;
import java.lang.Integer;
import java.util.Date;

/**
 * entity
 * @author gcg
 * 
 * 2017年4月14日 下午4:15:55
 */
public class Staff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String FIELD_ID = "id";
	public static final String FIELD_LOGIN_NAME = "login_name";
	public static final String FIELD_PASSWORD = "password";
	public static final String FIELD_REAL_NAME = "real_name";
	public static final String FIELD_POSITION_ID = "position_id";
	public static final String FIELD_REMARK = "remark";
	public static final String FIELD_FLAG = "flag";
	public static final String FIELD_CREATE_TIME = "create_time";
	
	private String id; //id
	private String loginName; //登录名
	private String password; //密码
	private String realName; //真实姓名
	private Integer positionId; //职位id
	private String remark; //备注
	private String flag; //
	private Date createTime; //时间
	
	public Staff() {
		super();
	}

	public Staff(String id) {
		this.id = id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName() {
		return this.loginName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRealName() {
		return this.realName;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public Integer getPositionId() {
		return this.positionId;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag() {
		return this.flag;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	
}