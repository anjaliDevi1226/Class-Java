package Project.Day6;



public class D extends C{
	
	private float d;

	public D(int a, int b, int c, float d) {
		super(a, b, c);
		this.d = d;
	}
	
	void show() {
		
		super.show();
		System.out.println("Value of D : "+ d);
	}
	
	

}
