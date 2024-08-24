package Project.Day6;

public class employee {
	
	private int eid;
	private String name;
	
	
	
	employee()
	{
		System.out.println("employee");
	}
	
	
	public employee (int eid, String name) {
		super();  //call base class default constructor
		this.eid = eid;
		this.name = name;
	}


	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	
	public void displaye() {
		System.out.println("Employee id : "+eid+"name : "+name);
	}

	/*
	public class PermanentEmployee extends employee {
		
		private float salary;
		private String addr;
		
		

		public PermanentEmployee(int eId,String name,float salary, String addr) {
			super(eid,name);   //overloaded constructor
			this.salary = salary;
			this.addr = addr;
		}


	  float getSalary() {
			return salary;
		}

		
		public void setSalary(float salary) {
			this.salary = salary;
		}

		
		
		public String getAddr() {
			return addr;
		}

		
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		public void displaye() {
			System.out.print("Employee Salary"+salary+"Address"+addr);
		}
	}*/
}
