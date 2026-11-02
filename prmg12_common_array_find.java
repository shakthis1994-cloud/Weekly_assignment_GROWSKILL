package Assignment;

public class prmg12_common_array_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = { 10, 20, 30, 40, 50 };
		int Array2[] = { 30, 40, 60, 70, 50 };

		for (int i = 0; i < Array1.length; i++) {
			for (int j = 0; j < Array2.length; j++) {
				if (Array1[i] == Array2[j]) {
					System.out.println("common arrays are " + Array1[i]);

				}

			}

		}

	}

}
