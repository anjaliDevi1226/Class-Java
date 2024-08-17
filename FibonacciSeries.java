package Projects;

public class FibonacciSeries {
	//assignment 1
	//Fibonacciseries under 100
	
	public static void main(String args[]) {
		
		int n=0;
		int n1=1;
		int j=1000;
		int n2;
		System.out.println("FibonacciSeries ");
		System.out.print(n+","+n1);
		
		for(int i=0; i<=j;++i) {
			 n2= n+n1;
			 System.out.print(","+n2);
			n=n1;
			n1=n2;
		 
		 
		}
				
				
	}

}
