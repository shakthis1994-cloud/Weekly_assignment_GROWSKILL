package Assignment;

public class prmg4_sum_of_even_numb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("even num is : " + i);
				sum = sum + i;
			}
		}

		System.out.println("Total sum of valus is :" + sum);

	}

}
