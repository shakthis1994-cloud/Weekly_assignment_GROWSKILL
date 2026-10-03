package Assignment;

public class prmg6_reverse_numb_for_loop {

	public static void main(String[] args) {

		int rev = 0;

		for (int num = 12345; num > 0; num = num / 10) { // num/10 will remove last digit , we can use num>10 or num!=0

			int digit = num % 10;
			rev = rev * 10 + digit;
		}

		System.out.println(rev);
	}

}
