package Day0409;

/*
 * make changes in the multi threading program to display individual characters of given string ,by main thread and child thread.
 * use  charAt() method of String
 */
class PrintChars extends Thread {

	String string1 = "Characters to print individually";

	@Override
	public void run() {
		try {

			for (int i = 0; i < string1.length(); i++) {
				System.out.print(string1.charAt(i)+" ");

				Thread.sleep(30);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

public class MultithreadingEg2 {

	static String string1 = "This is to print individual characters";

	public static void main(String[] args) {

		try {

			PrintCharts thread = new PrintCharts();
			thread.start();
			for (int i = 0; i < string1.length(); i++) {
				System.out.print(string1.charAt(i)+" ");
				Thread.sleep(25);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
