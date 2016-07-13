package com.zsx.cluster.components.impl;

import com.zsx.cluster.components.MyComponent;
import com.zsx.cluster.enums.Status;

public class MyZookeeper implements MyComponent{
	private Boolean zookeeper;
	private String version;
	private Status rstatus;
	
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
	
}
