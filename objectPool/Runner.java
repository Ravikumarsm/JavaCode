package NthD.ravi.objectPool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {
	 public static void main(String args[]) throws IOException,
     FileNotFoundException, ClassNotFoundException {
	College college=new College();
	college.setName("NCET");
	college.setNoOfColleges(140);
	college.getLibrary().setBookID("JAVA123");
	college.getStudents();
	File fromFile = new File("D:\\Uni_col.txt");
    try {
        FileInputStream fis = new FileInputStream(fromFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        College col = (College) ois.readObject();
        System.out.println("Deserialized data: \n"+ col.getName() + " "+ col.getNoOfColleges() +" "+ col.getLibrary().getBookID()+" "+col.getStudents()+ "  from University");
        ois.close();
    } catch(IOException e) {
        System.out.println("Deserialization failed");
        System.out.println(e);
        System.exit(1);
    } catch(ClassNotFoundException e) {
        System.out.println("Deserialization failed");
        System.out.println(e);
       
    }
	

	 }
}