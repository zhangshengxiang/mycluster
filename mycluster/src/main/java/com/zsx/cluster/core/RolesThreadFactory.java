package com.zsx.cluster.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public  class RolesThreadFactory implements ThreadFactory {
	static final AtomicInteger poolNumber = new AtomicInteger(1);
	private String name;
	
	private RolesThreadFactory(Bulider bulider){
		name = bulider.name;
	}
	
	public Thread newThread(Runnable r) {
		
		return new Thread(r);
	}
	
	public static class Bulider{
		
		private String name;
		
		public Bulider setName(String name){
			this.name = name;
			return this;
		}
		
		public RolesThreadFactory bulid(){
			return new RolesThreadFactory(this);
		}
	}

}
