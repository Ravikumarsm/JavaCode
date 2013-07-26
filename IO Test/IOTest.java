package NthD.ravi.IOModule;

import java.io.*;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {

		int userChoise=0;
		Scanner sc1 = new Scanner(System.in);

		while(userChoise!=2)
		{
			System.out.println("press 1 to perform IO operation using FileReader and FileWriter");
			System.out.println("press 2 to perform IO operation using BuffererReader and BufferedWriter");
			System.out.println("Enter your choice");
			userChoise = sc1.nextInt();
			File file = new File("D:\\IOTest.txt");
			switch(userChoise)
			{
			case 1:
				FileWriter fw=null;
				
				try {
					fw=new FileWriter(file);
					
					fw.write("HelloWorld JAVA");
					fw.flush();

				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				break;
			case 2:
				try{
					BufferedWriter bw=new BufferedWriter(new FileWriter(file));
					BufferedReader br = new BufferedReader(new FileReader(file));
					bw.write("Writing into the file using BufferedWriter");
					bw.flush();
					String  strLine;
					while ((strLine = br.readLine()) != null)   {
						System.out.println (strLine);
					}
				}
				catch (Exception e){
					System.err.println("Error: " + e.getMessage());
				}
				break;

			case 3: 

			}
		}




	}
}



