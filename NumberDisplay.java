package NthDimenzion.assignment.NumberTest;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class NumberDisplay {
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
}
}
