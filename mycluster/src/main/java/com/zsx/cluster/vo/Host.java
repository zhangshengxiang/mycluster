package com.zsx.cluster.vo;

import java.util.List;

import com.zsx.cluster.components.MyComponent;
import com.zsx.cluster.enums.Status;

public class Host {
	
	private String alias;
	private String ip;
	private Integer port;
	private String user;
	private String password;
	private List<MyComponent> comps;
	private Status hstatus;
	
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Status getHstatus() {
		return hstatus;
	}
	public void setHstatus(Status hstatus) {
		this.hstatus = hstatus;
	}
	public List<MyComponent> getComps() {
		return comps;
	}
	public void setComps(List<MyComponent> comps) {
		this.comps = comps;
	}
	
}
