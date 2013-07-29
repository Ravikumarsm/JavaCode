package Nthd.ravi.exceptionModule;

import java.util.Scanner;

public class TestATM {
	public static void main(String[] ar)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int userAmount=scan.nextInt();
		try
		{
			ATM a = new ATM("ICICI");
			String owner = "Mr.NthD";

			Card c1 = new Card(owner, 10000);


			if(userAmount > 0)
			{
				a.withDraw(c1,userAmount);
				System.out.println("Total balance is "+c1.getBalance());
			}
			else
			{
				throw new IllegalArgumentException();
			}



		}
		catch(NotEnoughBalanceInCardException e)
		{
			System.out.println(" "+e.toString());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
