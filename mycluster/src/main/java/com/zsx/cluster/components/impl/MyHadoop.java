package com.zsx.cluster.components.impl;

import com.zsx.cluster.components.MyComponent;
import com.zsx.cluster.enums.HadoopType;
import com.zsx.cluster.enums.Status;

public class MyHadoop implements MyComponent{
	private HadoopType hadoop;
	private String version;
	private Status rstatus;
	
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
	
}
