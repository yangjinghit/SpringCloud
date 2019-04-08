package com.yj;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {

	private Long deptno;
	private String dname;
	private String dbname;
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", dbname=" + dbname + "]";
	}
	
	
	
}
