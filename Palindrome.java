package NthDimenzion.assignment.NumberTest;

public class Palindrome {
	public static void main(String[] args)
	{
	int number =454;
	int num =number;
	int reversedNumber = 0;
	int temp=0;

	while(number > 0)
	{
		temp = number % 10;
		number = number / 10;
		reversedNumber = reversedNumber * 10 + temp;

	}
	if(num == reversedNumber)
	System.out.println(num + " is a palindrome");
	else
	System.out.println(num + " not a palindrome ");
	
	}
	}


