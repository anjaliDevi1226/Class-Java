package Project.Day2;

public class ReverseAnArry {
	
public static void main (String args[]) {
		
		int pincome[]=new int[5];
		pincome[0]=32;
		pincome[1]=21;
		pincome[2]=11;
		pincome[3]=41;
		pincome[4]=15;
		
		
		printAnArry(pincome);
		//call print method here
		int [] reversevalue= reverse(pincome);
		System.out.println("Reversed arry below");
		printAnArry(reversevalue);
		
		//print directly
		
		System.out.println("-----------print directly------------");
		//printAnArry(pincome);
		
		int [] reversevalues= reverse(pincome);
		
		for(int i=0;i<reversevalues.length;i++) {
			
			System.out.println(reversevalues[i]);
		}
		
		
}

//common method for reverse an arry 

 static int[] reverse(int[] avalues)
  {
	  int n =avalues.length ,tmp;
	  
	  for(int i=0; i<n/2;i++) {
		  tmp=avalues[i];//32
		  avalues[i]= avalues[n-i-1];//32=15
		  avalues[n-i-1]=tmp;  //15=32
	  }
	  
	  return avalues;
  }
  
  //common method for print an arry
  
   static void printAnArry(int [] arr) {
  System.out.println("-----------display began-------------");
  for(int i=0;i<arr.length;i++) {
		
		System.out.println("PerCapita income of the city "+i+" is "+arr[i]);
		
				}
  System.out.println("-----------display end-------------");
  }

}
