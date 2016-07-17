package com.zsx.cluster;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.alibaba.fastjson.JSON;
import com.zsx.cluster.core.RolesThreadFactory;
import com.zsx.cluster.management.Cluster;

public class StartHA {
	private static Cluster cluster;
	
	private static <T> T parseObject(String json, Class<T> c) {
		return JSON.parseObject(json, c);
	}
	
	public static String reader() throws Exception{
		StringBuilder content = new StringBuilder();
		byte[] bts = new byte[1024];
		int lenth = 0;
		File f = new File("conf/hosts.json");
		InputStream in = new FileInputStream(f);
		while((lenth=in.read(bts, 0,bts.length))!=-1){
			for(int i = 0;i< lenth;i++){
				char ctmp = (char)bts[i];
				if(ctmp==0x0A||ctmp==0x0D||ctmp==0x09){
					//discard current char
				}else{
					content.append(ctmp);
				}
			}
		}
		in.close();
		return content.toString();
	}
	
	public static String parseJson(List<Cluster> list){
		String json = null;
		
		for(Cluster c:list){
		json = JSON.toJSON(c).toString();
		}
		return json;
	}
	
	public void init(){
		run();
	}
	
	public void run(){
		//thread tree
		
		ThreadFactory threads = new RolesThreadFactory.Bulider().setName("ROLES").bulid();
		ExecutorService execute = Executors.newFixedThreadPool(5, threads);
		
		for(int i=0;i<5;i++){
			//execute.submit();
		}
		
		while(true){
			
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		String json = reader();
		System.out.println(json);
		cluster = parseObject(json,Cluster.class);
		System.out.println(cluster.toString());
	}
	
}
