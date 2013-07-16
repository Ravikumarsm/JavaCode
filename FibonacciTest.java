package NthDimenzion.assignment.NumberTest;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String [] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number to display");
		int num=scan.nextInt();
		int f1, f2=0, f3=1;
		int i;
		int a[]=new int[num+1];
		for(i=0;i<=num;i++){
			//System.out.print(f3+" ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;

			a[i]=f3;
			System.out.println(a[i]);
		}
		int j=1;
		a:for(int k=1;k<a.length;k++){
			 for(j=0;j<a.length;j++)
			 {
			if( a[j] != k){
				System.out.print(" "+k);
			  continue a;
			  }
		
		}
			 
	}

}

}
