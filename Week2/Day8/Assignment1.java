package Day8;

//Day8
//Assignment#1 
//Is it compulsory for an abstract class to have abstract method? please share source code to justify
abstract class Check1
{
	int i=10;
	public Check1(int i) 
	{
		this.i = i;
	}


	void print() 
	{
		System.out.println(i);
	}


	 	
}

//class
class SubClass extends Check1 {
	
	int j=20;
	
	public SubClass(int i, int j) {
		super(i);
		this.j = j;
	}
	protected void display() {
		super.print();
		System.out.println(j);
	}		
}


public class Assignment1 {
	   
	   public static void main(String []args) {
		   
		   SubClass sobj=new SubClass(10,200);
		   sobj.display();
	   }
   }
 

