package Day12;


	
enum Daysw {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
};
	
public class Assignment2 {

	Day day = Day.MONDAY;
	
	public static void main(String[] a) {

		Day today = Day.WEDNESDAY;
		printWeekend(today);
	}

	// an enum type can be used as local variable, parameter
	static public void printWeekend(Day today) {
		if (today == Day.SATURDAY) {
			System.out.println("It's Weekend, Saturday");
		} else if (today == Day.SUNDAY) {
			System.out.println("It's Weekend, Sunday");
		} else {
			System.out.println("It's not Weekend");
		}
		
		switch(today){
		case MONDAY:
		System.out.println("Today is Monday");
		break;
		case TUESDAY:
			System.out.println("Today is Tuseday");
			break;
		case WEDNESDAY:
			System.out.println("Today is Wednesday");
			break;
			default:
				
				System.out.println("it is not Monday,Tuesday,Wednesday");
		
			
		}
	}

	//an enum type can be used as return type
	Day getSunday() {
		return Day.SUNDAY;
	}
}


