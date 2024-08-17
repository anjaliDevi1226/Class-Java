package Projects;

public class PrimeNumber {
	
	public static void main(String args[]) {
		int n=11;
		for(int i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				System.out.println(n+ " is not a prime");
				
							}
			else {
				System.out.println(n+ " is a prime");
			}
			
			break;
		}
	}

}
