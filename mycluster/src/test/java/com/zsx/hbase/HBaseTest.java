package com.zsx.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class HBaseTest {

	public static void main(String[] args) throws IOException {
		HBaseTest table = new HBaseTest();
		table.getCreateHTable();
	}
	
	public void getCreateHTable() throws IOException{
		Configuration cfg = HBaseConfiguration.create();
		cfg.set("hbase.zookeeper.quorum","slave01,slave02,slave03");
		cfg.set("hbase.zookeeper.property.clientPort","2181");
		
		Connection c = ConnectionFactory.createConnection(cfg);
		//create a Htable admin
		HBaseAdmin admin = (HBaseAdmin) c.getAdmin();
		boolean b = admin.tableExists(Bytes.toBytes("user"));
		if(b)admin.deleteTable(Bytes.toBytes("user"));
		HTableDescriptor tdesc = new HTableDescriptor(TableName.valueOf("user"));
		tdesc.addFamily(new HColumnDescriptor(Bytes.toBytes("info")));
		tdesc.addFamily(new HColumnDescriptor(Bytes.toBytes("secret")));
		admin.createTable(tdesc);
		admin.close();
		
	}
}
