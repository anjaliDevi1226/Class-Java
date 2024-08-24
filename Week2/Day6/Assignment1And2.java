package Project.Day6;
/*
 * 1)In given multilevel inheritance example with classes A,B,C create another class D,which is derived class of C.Let D have a data member 1 of tuype float .
Add appropriate constructor in class D,to initialize data members ,also create show() method in D.
 2)in the above example make all data members private and check if it works fine
assignment 1 &2 day 6

 */

public class Assignment1And2 {
	
	public static void main(String []args) {
		
		D obj=new D(2,3,3,6.3f);
		obj.show();
		
	}

}
