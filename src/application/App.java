package application;

public class App {
	public static void main(String[] args) {
		float floatValue = 23.70f;
		/* for something like 23.70, get an error because
		 * Java automatically assumes it's a double;
		 * have to append f to force it to be a float
		 */
		double doubeValue = 23343.78;
		//usually use double
		
		System.out.printf("float has %d bytes \n", Float.SIZE/8);
		System.out.printf("double has %d bytes \n", Double.SIZE/8);
		
		//how many significant digits can you have for each?
		
		float f = 1.234567891234567f;
		
		System.out.printf("%.20f\n", f);
		/*this shows that precision is lost around the 7th
		 * decimal place
		 */
		
		double d = 1.23456789123456789;
		System.out.printf("%.20f\n", d);
		/*this shows that precision is lost around the 15th
		 * decimal place
		 */
		
		//Have to use the Big class, etc for really large numbers
	}
}
