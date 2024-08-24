package Day6checkinheritance;

/*
 * In given Employee,PermanentEmployee example Inheritance.Create Temporary employee as Hierarchical inheritance with display()
 * method as explained.And make changes to have main program in different package 
 */

import Pday6.TemporaryEmployee;
import Project.Day6.PermanentEmployee;

public class Assignment3MainProgram {
	
	public static void main(String args[])
	{
		//create object of permanent employee
		
		PermanentEmployee pobj=new PermanentEmployee (111,"name111",115.08f,"addr1");
		
		pobj.displays();
		pobj.displaye();
		
		TemporaryEmployee tobj= new TemporaryEmployee(112,"name112",112.09f,"addr12");
		
		tobj.displayt();
		tobj.displaye();
	}

}
