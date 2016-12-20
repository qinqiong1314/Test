package com.ssm.pojo;

import java.io.Serializable;

public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;
	private String ename;
	private String dname;
	private String job;
	private Integer sal;
	private String loc;
	
	
	public Staff() {

	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

}
