package Nthd.ravi.IOmodule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileToFolder {

	 public static void main(String[] args) {
         try {
                 File sourceFile = new File("E:\\practice.txt");
                 File destinationFile = new File("G:\\" + sourceFile.getName());
                 System.out.println(sourceFile.getName());
                copyFile(sourceFile, destinationFile);
         } catch (Exception e) {
                 e.printStackTrace();
         }
 }

 public static void copyFile(File sourceFile, File destinationFile) throws IOException {
                 FileInputStream inputStream = new FileInputStream(sourceFile);
                 FileOutputStream outputStream = new FileOutputStream(destinationFile);
                 int bufferSize;
                 byte[] bufffer = new byte[256];
                 while ((bufferSize = inputStream.read(bufffer)) > 0) {
                         outputStream.write(bufffer, 0, bufferSize);
                 }
                 inputStream.close();
                 outputStream.close();
 }
 }
