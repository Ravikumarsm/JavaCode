package Nthd.ravi.exceptionModule;

public class TestException {
	public static void main(String[] args)
	{
		try
		{

			if(args.length >= 2)
			{
				int i1 = Integer.parseInt(args[0]);
				int i2 = Integer.parseInt(args[1]);

				System.out.println("trying to divide "+i1+ " with "+i2);
				int result = i1 / i2;
				System.out.println("result = "+result);
			}
			else
				System.out.println("Enter the two numbers");

			return;
		}
		catch(NumberFormatException e)
		{
			System.out.println("inside NFE catch block ");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("inside generic catch...");
			System.out.println("trying to divide number by zero...");
		}
		finally
		{
			System.out.println("inside finally...");

		}
		System.out.println("after try..catch");

	}
}
