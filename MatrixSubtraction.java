package NthDimenzion.assignment.NumberTest;

public class MatrixSubtraction {
	public static void main(String args[])
	{
		int [][]x={{7,8,9},{4,5,6}};
		int [][]y={{5,6,7},{1,3,3}};

		/*display 1st matrix */

		System.out.println("first matrix is: ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<=x.length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();

		/* display 2nd matrix */

		System.out.println("Second matrix is: ");
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<=y.length;j++)
			{
				System.out.print(y[i][j]+" ");	
			}
			System.out.println();
			System.out.println();
		}
		System.out.println();

		System.out.println("subtraction of both matrix : ");
		for(int i = 0; i <x.length; i++) 
		{
			for(int j = 0; j <= x.length; j++) 
			{

				System.out.print((x[i][j]-y[i][j])+" ");
			}  
			System.out.println();
			System.out.println();
		}   
	}
}


