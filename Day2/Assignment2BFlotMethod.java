package Project.Day2;

public class Assignment2BFlotMethod {
	
	//check whether user is able to divide a number by 2
public static void main(String args[]) {
		
		float n=2.0f;
		
		methodforcheck(n);
	}


	static void methodforcheck(float num)
	{
	
		if(num/2==0) {
			
			System.out.println(num+" is divisible by 2");
		}
		
		else
		{
			System.out.println(num+" is not divisible by 2");
		}
	}

}
