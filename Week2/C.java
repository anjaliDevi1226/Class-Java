package Project.Day6;

public class C extends B{
	
	private int c;

	public C(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	void show() {
		
		super.show();
		System.out.println("Value of C : "+c);
		
	}

}
