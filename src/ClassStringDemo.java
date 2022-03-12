/*
 * Author: Stanley Pieda
 * Date: Sept 25, 2020
 * Description: Simple demonstration of Class String.
 */
public class ClassStringDemo {

	public static void main(String[] arguments) {
		// Set a break point on the String aaa line of code.
		// Step over the lines of code, and watch
		// reference id values in the variables window.
		String aaa = "Tuna Fish";
		String bbb = "Tuna Fish";
		String ccc = "Tuna Fish";
		String ddd = new String("Tuna Fish"); 
		String upper = aaa.toUpperCase();
		System.out.println(aaa);
		System.out.println(bbb);
		System.out.println(ccc);
		System.out.println(ddd);
		System.out.println(upper);
		

	}

}
