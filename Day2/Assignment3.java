package Project.Day2;

public class Assignment3 {
	
	//reverse the given digit and print, eg 6814; print each digit separately (do not use String)
	
	public static void main(String args[])
	{
	int number=6814;
	int reverse=0;
	 
	 while(number!=0) {
		 
		 int n=number%10;
		 System.out.println("number = "+n);
		 reverse=reverse*10+n;
		 number=number/10;
		 
	 }
	 
	// System.out.println("number = "+reverse);
	}
}
