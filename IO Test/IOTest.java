package NthD.ravi.IOModule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {

		int userChoise=0;
		Scanner sc1 = new Scanner(System.in);

		while(userChoise!=3)
		{
			System.out.println("press 1 to perform IO operation using FileReader and FileWriter");
			System.out.println("press 2 to perform IO operation using BuffererReader and BufferedWriter");
			System.out.println("press 3 to perform IO operation using ObjectInputStream and ObjectInputStream");
			System.out.println("Enter your choice");
			userChoise = sc1.nextInt();
			File file = new File("D:\\IOTest.txt");
			switch(userChoise)
			{
			case 1:
				FileWriter fw=null;
				FileReader fr=null;
				try {
					fw=new FileWriter(file);
					fr=new FileReader(file);
					fw.write("HelloWorld JAVA");
					fw.flush();

					int c;

					while ((c = fr.read())!= 0) {
						System.out.println(c);
						fr.read();
						System.out.println(fr);
					}

				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
				break;
			case 2:
				BufferedWriter bw=null;
				BufferedReader br=null;
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the values to write into the file");
				String val=scan.nextLine();
				try
				{
					System.out.println(val);
					bw=new BufferedWriter(new FileWriter(file,true));
					bw.write(val);
					br=new BufferedReader(new FileReader(file));
					String line;
					while((line=br.readLine())!=null)
					{
						System.out.println(line);
					}
					bw.close();
				}
				catch (Exception e) {
					System.out.println("error in writing a file");
				}
				break;


			case 3: 
				ArrayList<String> list=new ArrayList<String>();
				list.add("JAVA");
				list.add(".NET");
				FileOutputStream fos;
				try {
					fos = new FileOutputStream(file);

					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(list);

					FileInputStream fis = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(fis);
					ois.readObject();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			break;



		}

	}
}




