package Pday6;

import Project.Day6.employee;

public class TemporaryEmployee extends employee {
	
	private float hourlyPay;
	
	private String company_addr;

	public TemporaryEmployee(int eid, String name,float hourlyPay,String company_addr) {
		super(eid, name);
		this.hourlyPay=hourlyPay;
		this.company_addr=company_addr;
	}
	
	public void displayt() {
		
		
		System.out.println("HourlyPay is : "+hourlyPay+" Company address is "+company_addr);
	}

}
