package Assignment;

public class prmg11_longest_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java programming is interesting";
		String words[] = s.split(" ");
		String longest = "";

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() > longest.length()) {
				longest = words[i];
			}

		}
		System.out.println("Longest word: " + longest);

	}

}
