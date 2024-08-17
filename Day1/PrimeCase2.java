package Projects;

public class PrimeCase2 {
	
	public static void main(String args[]) {
		int n=27;
		boolean is_prime=true;
		for(int i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				is_prime=false;
				break;
							}
		}
			
			if(!is_prime) {
				System.out.println(n+ " is not a prime");
			}
			else {
				System.out.println(n+ " is a prime");
			}
		
	}

}
