package Day7;
/*
 * Assignment 2-day7
 * In product class given example,override equals() method,to
 *  specify that two product objects are same only if product id is equals
 */



class Products {
    int id;
    String name;
    
	public Products(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.print("Products");
	}
    
	public String toString() {
		
		return " product Id :"+id+"Product name :"+name;
		
		
	}
	
	public boolean equals(Object obj) {
		
		Products pro=(Products)obj;
		if(this.id==pro.id)
			return true;
		else
			return false;
	}
   
}
 class EelectronicProduct extends Products{
	 float voltage;

	public EelectronicProduct(int id, String name, int voltage) {
		super(id, name);
		this.voltage = voltage;
	}

	void display(){
		System.out.print("Electronic Product");
	}
	
public String toString() {
		
		return " product Id :"+id+" Product name :"+name+" Voltege"+voltage;
		
		
	}
	}
 public class Assignment2{
	 public static void main(String args[]) {
		 
		 
		 
		 Products pro1=new EelectronicProduct(123,"TV",12);
		 Products pro2=new EelectronicProduct(123,"PC",10);
		 System.out.println(pro1.equals(pro2));
		 System.out.println(pro1.toString());
		 System.out.println(pro2.toString());
		 
	 }
	 
	 
 }
 
 
 
	 
 