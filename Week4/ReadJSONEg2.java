package com.ejson;
/*
 * Develop a program to write and read JSON dependency .without using corresponding POJO classes.(Hint : use Object node of jackson)
 */
import java.io.FileInputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ReadJSONEg2 {

	public static void main (String[]args) throws Exception{
		
		ObjectMapper omapper=new ObjectMapper();
		FileInputStream fis=new FileInputStream("./operson.json");
		ObjectNode onode =(ObjectNode)omapper.readTree(fis);
		String str=omapper.writeValueAsString(onode);
		System.out.print(str);
		
		
	}
	
}
