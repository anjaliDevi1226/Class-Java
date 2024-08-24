package Project.Day2;

public class Assignment2APrimeMethod {
	
	public static void main(String args[]) {
		
		int n= 23;
		
		methodforprime(n);
	}


	static void methodforprime(int num)
	{
	
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				
				System.out.println(num+" not a prime number");
				
				return;
					
			}
		}
			 			System.out.println(num+" is a prime number");
			
	}
	
	}
	

	

