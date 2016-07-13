package com.zsx.cluster;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.zsx.cluster.components.MyComponent;
import com.zsx.cluster.components.impl.MyHadoop;
import com.zsx.cluster.enums.ClusterType;
import com.zsx.cluster.enums.HadoopType;
import com.zsx.cluster.enums.Status;
import com.zsx.cluster.vo.Cluster;
import com.zsx.cluster.vo.Host;

public class StartHA {

	public static void main(String[] args) {
		List<Cluster> clist = new ArrayList<Cluster>();
		List<Host> hlist = new ArrayList<Host>();
		List<MyComponent> list = new ArrayList<MyComponent>();
		//case1 praseJson
		MyHadoop r = new MyHadoop();
		r.setHadoop(HadoopType.MASTER);
		r.setRstatus(Status.ACTIVE);
		r.setVersion("1.2.5");
		list.add(r);
		
		Host h = new Host();
		h.setAlias("master");
		h.setIp("192.168.31.120");
		h.setHstatus(Status.ACTIVE);
		h.setPassword("hadoop");
		h.setPort(22);
		h.setUser("hadoop");
		h.setComps(list);
		hlist.add(h);
		
		Cluster c = new Cluster();
		c.setAmount(5);
		c.setClusterNM("mycluster");
		c.setCstatus(Status.ACTIVE);
		c.setDescription("my first cluster");
		c.setHosts(hlist);
		c.setType(ClusterType.HA);
		clist.add(c);
		
		System.out.println(parseJson(clist));
		
		
	}
	
	public static void  parseObject(String json){
		Cluster c = JSON.parseObject(json, Cluster.class);
	}
	
	public static String parseJson(List<Cluster> list){
		String json = null;
		
		json = JSON.toJSON(list.get(0)).toString();
		
		return json;
	}
	
}
