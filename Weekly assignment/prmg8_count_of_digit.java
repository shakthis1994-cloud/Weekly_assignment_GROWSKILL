package Assignment;

public class prmg8_count_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int count = 0;

		for (; num != 0; num = num / 10) {
			count++;
		}
		System.out.println("count is : " + count);
	}

}
