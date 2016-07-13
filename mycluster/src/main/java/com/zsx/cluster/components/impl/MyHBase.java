package com.zsx.cluster.components.impl;

import com.zsx.cluster.components.MyComponent;
import com.zsx.cluster.enums.HBaseType;
import com.zsx.cluster.enums.Status;

public class MyHBase implements MyComponent{
	private HBaseType hbase;
	private String version;
	private Status rstatus;
	
	public HBaseType getHbase() {
		return hbase;
	}
	public void setHbase(HBaseType hbase) {
		this.hbase = hbase;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Status getRstatus() {
		return rstatus;
	}
	public void setRstatus(Status rstatus) {
		this.rstatus = rstatus;
	}
	
}
