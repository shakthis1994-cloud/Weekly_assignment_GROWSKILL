package Assignment;

public class prmg11_missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {

			sum1 = sum1 + i;

		}
		System.out.println("sum1 value is " + sum1);

		for (int i = 0; i < num.length; i++) {

			sum2 = sum2 + num[i];

		}
		System.out.println("sum2 value is " + sum2);

		System.out.println(sum1 - sum2 + " is missing numb");

	}

}
