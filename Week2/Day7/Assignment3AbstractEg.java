package Day7;

/*
 * Day 7 -Assignment3
 * Make changes to given animal class (abstract class),to 
 * a)add some data members such as animal name
 * b)Check if abstract classes can have constructor .use super keyword if required
 * 
 * 
 */
		
//Day 7
//Assignment 3
abstract class Animal
{
	abstract void move();
	
	String l; 
	String t; 
	String b; 
	String e;
	
	

	public Animal(String l, String t, String b, String e) {
		super();
		this.l = l;
		this.t = t;
		this.b = b;
		this.e = e;
	}



	void eat() {
		System.out.println("Animals : "+l+" , "+t+" , "+b+" , "+e);
	}
	
}

//concrete class

class Snake extends Animal{

	public Snake(String l, String t, String b, String e) {
		super(l, t, b, e);
		// TODO Auto-generated constructor stub
	}

	@Override
	void move() {
		super.eat();
		System.out.println("Crawling...");
		
	}
	
	
}
public class Assignment3AbstractEg {

	public static void main(String[] args) {
		Animal obj=new Snake("Lion","Tiger","Bear","Elephant");
		obj.move();
	}
}
