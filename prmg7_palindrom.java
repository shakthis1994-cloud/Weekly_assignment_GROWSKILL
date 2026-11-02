package Assignment;

public class prmg7_palindrom {

	public static void main(String[] args) {
		// palindrom means if you reverse the num same value should come Ex : 121

		int num = 1221;
		int original = num;
		int rev = 0;

		for (; num != 0; num = num / 10) {
			int digit = num % 10;
			rev = rev * 10 + digit;
		}

		if (original == rev)
			System.out.println(original + " its an palindrom");
		else
			System.out.println(original + " its not a palindrom");

	}

}
