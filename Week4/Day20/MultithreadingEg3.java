package Day0409;

/*
 * Repeat above,using common string and index for both main and child thread
 */

class PrintCharts extends Thread {

	


	@Override
	public void run() {
		try {

			for (;MultithreadingEg3.getIndex() < MultithreadingEg3.getString1().length();) {
				System.out.print(MultithreadingEg3.getString1().charAt(MultithreadingEg3.getIndex()) + " ");
				MultithreadingEg3.incrIndex();
				Thread.sleep(30);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}

public class MultithreadingEg3 {

	//static String string1 = "This is to print individual characters";
  private static String string1 = "This is to print individual characters";
	
	private static int index=0;
	
	 
	public static String getString1() {
		return string1;
	}

 
	public static int getIndex() {
		return index;
	}
	public static int incrIndex() {
		return index;
	}
 
	public static void setIndex(int index) {
		MultithreadingEg3.index = index;
	}


	public static void main(String[] args)  {

		try {

			PrintChars thread = new PrintChars();
			thread.start();
			for (;index  < string1.length(); index++) {
				System.out.print(string1.charAt(index)+" ");
				Thread.sleep(25);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}