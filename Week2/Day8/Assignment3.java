package Day8;
//Assignment 3

/*
* In given Dwepartment , university classes code snippet,create atleast two department ,
* and set those 2 department to university object.Hint:override toString()
*/


class Department {
	private int id;
	private String deptname;
	private String hod_name;
	

    

    public Department(int id, String deptname, String hod_name) {
		this.id = id;
		this.deptname = deptname;
		this.hod_name = hod_name;
	}




	@Override
    public String toString() {
    	return " Department name:" +deptname+ " , Depatment ID : "+id+", Department head: "+hod_name;
    }
}

class University {
	String name;
	String address;
	Department depts[];

    

    public University(String name, String address, Department[] depts) {
		super();
		this.name = name;
		this.address = address;
		this.depts = depts;
	}



	@Override
    public String toString() {
    	
        
        String sb="University{name='"+ name +" , Address"+address+ "', departments=[";
        for (Department dept : depts) {
        sb=sb+dept.toString()+", ";
        }
        sb=sb+"]";
         return sb.toString();
       
    	
    }
}
public class Assignment3 {

	
public static void main(String[] args) {
    	
        Department csDep = new Department(1234,"Computer Science", "Dr. Raj");
        Department chemDep = new Department(1456,"Chemistry", "Dr. Roslin");

        Department[] deprt1 = {csDep};
        Department[] deprt2 = {chemDep};
        
        University university = new University("MG University","Tower1", deprt1);
        University university1 = new University("MG University","Tower1", deprt2);

        System.out.println(university);
        System.out.println(university1);
    }
}
