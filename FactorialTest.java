package NthDimenzion.assignment.NumberTest;

public class FactorialTest {
public	int FactorialTest(int n)	{
		int fact;
		fact = 1;
		if(n==1) return 1;
		return FactorialTest(n-1)*n;
	}
	public static void main(String args[])
	{
	FactorialTest f =new FactorialTest();
	System.out.println("Fact of 1 "+f.FactorialTest(1));
	System.out.println("Fact of 5 "+f.FactorialTest(5));	
	}
	}


