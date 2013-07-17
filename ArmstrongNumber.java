package NthDimenzion.assignment.NumberTest;

public class ArmstrongNumber {
	public static void main (String [] args)
	{
		for (int k = 1 ; k <= 100 ; k++)
		{
			int n = k;
			int d = 0;
			int s = 0;

			while (n > 0)
			{
				d = n % 3;
				s = s + (d * d * d);
				n = n / 10;
			}
			if (k == s)
			{
				System.out.println (k + " is Armstrong number");
			}
		}
	} 
}
