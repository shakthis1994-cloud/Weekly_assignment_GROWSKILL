package Assignment;

public class prmg9_Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int am =0;
		int original = num;
		
		
		for(; num>0;)
		{
			int digital= num%10;
			am = am + digital*digital*digital;
			num = num/10;
		}
		
		if(original == am)
		{
			System.out.println(am  + " is amstrong number");
		}
		else
			System.out.println(am + "is not an amstrng numb");
	}

}
