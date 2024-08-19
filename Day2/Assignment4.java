package Project.Day2;

public class Assignment4 {
	
	//Declare array with petrol price in 6 cities ,calculate the average price and print
	
	public static void main(String args[]) {
		
		int[] price=new int[6];
		price[0]=100;
		price[1]=110;
		price[2]=115;
		price[3]=108;
		price[4]=104;
		price[5]=106;
		
		int n=0;
		
		for(int i=0;i<price.length;i++) {
			
			n=n+price[i];
		}
		
		System.out.println("Average Price = "+n/price.length);
	
	}

}
