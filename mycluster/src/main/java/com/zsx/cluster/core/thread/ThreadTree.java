package com.zsx.cluster.core.thread;

import java.util.TreeMap;

import com.zsx.cluster.management.Cluster;
import com.zsx.cluster.management.Host;

public class ThreadTree {
	
	TreeMap<String,Runnable> thrdTree = new TreeMap<String,Runnable>();
	
	public TreeMap<String,Runnable> createTree(Cluster c){
		int count = 0;
		
		//level 0
		thrdTree.put("cluster."+count++, c);
		//level 1
		for(Host h:c.getHosts()){
			
		}
		return null;
	}
}
