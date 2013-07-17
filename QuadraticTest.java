package NthDimenzion.assignment.NumberTest;

public class QuadraticTest {
	int a,b,c;
	int d;
	double root,root1,root2;
	QuadraticTest(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void cal()
	{
		d=(b*b)-(4*a*c);
		if(d>0)
		{
			root1=(-b + Math.sqrt(d))/(2*a);
			root2=(-b - Math.sqrt(d))/(2*a);
			System.out.println("Roots are distinct");
			System.out.println( root1 + "," + root2);
		}
		else if(d==0)
		{
			root=(-b)/(2*a);
			System.out.println("Only one root is distinct");
			System.out.println(root);
		}
		else if(d<0)
		{
			System.out.println("Roots are imaginary");
		}
	} 


	public static void main(String args[])
	{
		QuadraticTest q =new QuadraticTest(3,4,5);
		q.cal();
	}
}


