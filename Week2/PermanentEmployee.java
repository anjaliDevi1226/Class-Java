package Project.Day6;

public class PermanentEmployee extends employee {
		
		private float salary;
		private String addr;
		
		

		public PermanentEmployee(int eid,String name,float salary, String addr) {
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
		
		public void displays() {
			
			System.out.println("Employee Salary : "+salary+" , Address : "+addr);
		}
	}

