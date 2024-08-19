package Project.Day2;

public class Assignment1Primenumebr {
	
	//Re-check prime number logic with lesser number of iterations
	public static void main(String args[]) {
	
	int n=27;
	
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0) {
			
			System.out.println(n+" not a prime number");
			
			return;
				
		}
	}
		 			System.out.println(n+" is a prime number");
			
			
			
		
		
	}

}
