package Assignment;

public class prmg5_even_odd_num {

	public static void main(String[] args) {

		System.out.println("Even numbers:");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) { // check if divisible by 2
				System.out.print(i + " ");
			}
		}

		System.out.println("\n\nOdd numbers:"); // \n\n → adds two blank lines before the text.
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) { // check if NOT divisible by 2
				System.out.print(i + " ");
			}
		}
	}
}
