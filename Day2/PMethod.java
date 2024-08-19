package Project.Day2;

public class PMethod {
	
public static void main (String args[]) {
		
		int pincome[]=new int[5];
		pincome[0]=32;
		pincome[1]=21;
		pincome[2]=11;
		pincome[3]=41;
		pincome[4]=15;
		
		{
        
			int min_pincome= minimumIncome(pincome);
			System.out.println("minimum value of percapita is "+min_pincome);
		}
			}
		
        
  static int minimumIncome(int[] avalues)    
  {
	 
        int min_pincome=avalues[0];
        for (int i=1;i<avalues.length;i++) {
        	if(min_pincome>avalues[i]) {
        		
        		min_pincome=avalues[i];
        		
        	}
        	}
        	        	
        return min_pincome ;
        
		
}
}
