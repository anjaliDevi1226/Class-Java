package Project.Day2;

public class Proj1Percapita {
	
	public static void main (String args[]) {
		
		int pincome[]=new int[5];
		pincome[0]=32;
		pincome[1]=21;
		pincome[2]=11;
		pincome[3]=41;
		pincome[4]=15;
		/*
		for(int i=0;i<pincome.length;i++) {
			
			System.out.println("PerCapita income of the city "+i+" is "+pincome[i]);
			
					}
		
		System.out.println("------------------------------------");
		
		
        for(int i= pincome.length-1;i>=0;i--) {
			
			System.out.println("PerCapita income of the city "+i+" is "+pincome[i]);
			
					}
					*/
		//find the minimum value 
        int min_pincome=pincome[0];
        for (int i=1;i<pincome.length;i++) {
        	if(min_pincome>pincome[i]) {
        		
        		min_pincome=pincome[i];
        		
        	}
        	        	
        }
        System.out.println("minimum value of percapita is "+min_pincome);
        
      //find the maximum value 
        int max_pincome=pincome[0];
        for (int i=1;i<pincome.length;i++) {
        	if(max_pincome<pincome[i]) {
        		
        		max_pincome=pincome[i];
        		
        	}
        	        	
        }
        System.out.println("maximum value of percapita is "+max_pincome);
		
	}

}
