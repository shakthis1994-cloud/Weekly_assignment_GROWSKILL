package Assignment;

public class pmg10_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Programming";
		int vowelscount = 0;

		for (int i = 0; i <= s.length()-1; i++) {
			char x = s.charAt(i);

			if (x == 'a' | x == 'e' | x == 'i' | x == 'o' | x == 'u') {
				System.out.println("vowels: " + x);
				vowelscount++;

			}

		}
		System.out.println("vowels count is:" + vowelscount);

	}

}
