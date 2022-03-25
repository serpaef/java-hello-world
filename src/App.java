public class App {
	public static void main(String[] args) {
		System.out.println("Hello World");

		/*
		 * BEGINNING OF PRIMITIVE TYPES
		 */

		// 32 bit value
		int myIntNumber = 88;

		// 16 bit value
		short myShortNumber = 870;

		// 64 bit value
		long myLongNumber = 8600;

		// floating point value
		double myDoubleNumber = 8.8;

		// char value uses single quote
		char myChar = 'f';

		// boolean
		boolean myBool = true;

		// byte type can hold a value between -128 and 127
		byte myByte = 127;

		System.out.println(myIntNumber);
		System.out.println(myShortNumber);
		System.out.println(myLongNumber);
		System.out.println(myDoubleNumber);
		System.out.println(myChar);
		System.out.println(myBool);
		System.out.println(myByte);

		/*
		 * END OF PRIMITIVE TYPES
		 */

		/*
		 * BEGINNING OF NON-PRIMITIVE TYPES
		 */

		// non-primitive types should me declared uppercase

		// String is a non-primitive type that comes by default in Java

		String myString = "That's my string";

		System.out.println(myString);

		/*
		 * END OF NON-PRIMITIVE TYPES
		 */

		/*
		 * LOOPS
		 */

		// WHILE

		int count = 0;
		int limit = 10;

		while (count <= limit) {
			System.out.println("While: " + count);
			count = count + 1;
		}

		// FOR

		for (int index = 1; index <= 10; index += 1) {
			System.out.println("For: " + index);
			// IF EXPERIMENTS
			if (index % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

		// DO...WHILE ~~ TODO

		/*
		 * USER INPUT
		 */
	}
}
