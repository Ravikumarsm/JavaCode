package NthDimenzion.assignment.NumberTest;

import java.util.Scanner;

public class NumberDisp {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to display");
		int num=scan.nextInt();
			int i,j;
			for(i=1;i<=num;i++)
			{
			for(j=1;j<=i;j++)
			System.out.print(" "+j);
			System.out.println();
			}
			for(int k=num;k>=0;k--)
			{
			for(j=1;j<k;j++)
			System.out.print(" "+j);
			System.out.println();
			}
			}
			}


