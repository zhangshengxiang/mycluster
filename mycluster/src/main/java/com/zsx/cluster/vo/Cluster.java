package com.zsx.cluster.vo;

import java.util.List;

import com.zsx.cluster.enums.ClusterType;
import com.zsx.cluster.enums.Status;

public class Cluster {
	
	private String clusterNM;
	private Integer amount;
	private String description;
	private ClusterType type;
	private List<Host> hosts;
	private Status cstatus;
	
	public String getClusterNM() {
		return clusterNM;
	}
	public void setClusterNM(String clusterNM) {
		this.clusterNM = clusterNM;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ClusterType getType() {
		return type;
	}
	public void setType(ClusterType type) {
		this.type = type;
	}
	public List<Host> getHosts() {
		return hosts;
	}
	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}
	public Status getCstatus() {
		return cstatus;
	}
	public void setCstatus(Status cstatus) {
		this.cstatus = cstatus;
	}
	
}
