package com.zsx.cluster.components.impl;

import com.zsx.cluster.components.Role;
import com.zsx.cluster.enums.HadoopType;
import com.zsx.cluster.enums.Status;

public class MyHadoop implements Role{
	private HadoopType hadoop;
	private String version;
	private Status rstatus;
	private Integer priority = 2;
	
	public HadoopType getHadoop() {
		return hadoop;
	}
	public void setHadoop(HadoopType hadoop) {
		this.hadoop = hadoop;
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
