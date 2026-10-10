package Assignment;

public class prmg10_Second_largest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] age = { 24, 29, 32, 38, 49 };

		int max = age[0];
		System.out.println(max);
		int max2 = max;

		for (int i = 0; i < age.length; i++) {

			if (age[i] > max)
				max2 = max;
			max = age[i];

		}

		System.out.println("Maximum element:" + max);
		System.out.println("max2 is " + max2);

	}

}
