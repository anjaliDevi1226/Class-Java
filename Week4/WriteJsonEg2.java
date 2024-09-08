package com.ejson;

import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class WriteJsonEg2 {
public static void main(String[] args)throws Exception{
	
	ObjectMapper omapper=new ObjectMapper();
	ObjectNode onode=omapper.createObjectNode();
	
	onode.put("name", "Ravi");
	onode.put("Age", 25);
	
	FileOutputStream fos=new FileOutputStream("./operson.json");
	omapper.writeValue(fos, onode);
}
	
}
