package Project.Day6;

public class B extends A {
	
private	int b;

	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	
	void show() {
		
		super.show();
		System.out.println("Value of B : "+ b);
	}

	
	
}

 
