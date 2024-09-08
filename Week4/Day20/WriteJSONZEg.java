package com.ejson;
/*
 * make changes in given JSON example to use nested object address in person class,and write the person object to file using Jackson. 
 */

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
public class WriteJSONZEg {
	
	public static void main(String[]args) throws Exception{
		
		Address addr=new Address ("street1","city1",678906);
		Person obj = new Person("Ravi",46,addr);
		obj.setName("Ravi");
		obj.setAge(40);
		
		
		ObjectMapper mapper= new ObjectMapper();
		
		FileOutputStream fos=new FileOutputStream("person.json");
		
		mapper.writeValue(fos,obj);
	}

}
