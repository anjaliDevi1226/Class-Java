
package Day8;
//Assignment2
//Create an array of type vehicle, can the arry also store object of derived classes(of vehicle )Please share the code to justify ?
public class Assignment2 {
	
	
	
	public static void main(String[]args) {
		
		VehicleClass vehi[]=new VehicleClass[5];
		vehi[0]=new VehicleClass("Bus");
		vehi[1]=new Car("Car");
		vehi[2]=new Bus("Bus");
		
		
		
	}

}
