package Day7;

/*Assignment 1
 * Final variable can be used for
 * a)data member
 * b)local variable
 * c)Can a object can be declared as final
 */
  
public class Assignment1 {
	
	final int ed1i=100;
	private String name;
	
	String emp1="Java";
	String emp2="C++";
	
		
	public void egOfFinalMethod() {
		
		final int emp2id=5678;
		System.out.println("Employee 2 ID:"+emp2id);
	}
	
  
	public static void main(String []args) {
		
		final Assignment1 es=new Assignment1();
		
		System.out.println("Skills");
		es.egOfFinalMethod();
		System.out.println("Employee 1 :"+es.emp1+"Employee 2 :"+es.emp2);
	}

	
		
	}

	

	

