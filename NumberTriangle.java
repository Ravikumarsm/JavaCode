package NthDimenzion.assignment.NumberTest;

import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to display");
		int num=scan.nextInt();
		for(int i=0;i<=num;i++){
			System.out.println();
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
		}
		for(int k=num;k>0;k--){
			System.out.println();
			for(int j=1;j<=k;j++){
				System.out.print(j+" ");
			}
		}
	}
	
}
