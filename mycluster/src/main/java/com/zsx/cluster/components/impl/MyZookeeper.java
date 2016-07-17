package com.zsx.cluster.components.impl;

import com.zsx.cluster.components.Role;
import com.zsx.cluster.enums.Status;

public class MyZookeeper implements Role{
	private Boolean zookeeper;
	private String version;
	private Status rstatus;
	private Integer priority = 1;
	
	public boolean isZookeeper() {
		return zookeeper;
	}
	public void setZookeeper(boolean zookeeper) {
		this.zookeeper = zookeeper;
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
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
}
