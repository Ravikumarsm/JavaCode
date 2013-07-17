package NthDimenzion.assignment.NumberTest;

public class ReverseNumber {
	public static void main(String args[])
	   {
	int n, reverse = 0;

	      n = 104;

	while( n != 0 )
	      {      reverse = reverse * 10;
	reverse = reverse + n%10;
	          n = n/10;
	      }
	System.out.println("Reverse of "+n+" number is "+reverse);
	   }
	}


