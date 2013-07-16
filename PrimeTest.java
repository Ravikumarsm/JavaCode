package NthDimenzion.assignment.NumberTest;

import java.util.Scanner;

public class PrimeTest {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check for prime ");
		int num=scan.nextInt();
		boolean isPrime=true;
		for(int j=2; j < num ; j++)
		{
			if(num % j == 0)
			{
				isPrime = false;
				System.out.println("the given number is not prime");

			}
			break;

		}

		if(isPrime)
		{
			System.out.print("the given is prime number");

		}	

	}
}	