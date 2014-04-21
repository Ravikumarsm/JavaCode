package org.nthdimenzion;

import com.google.common.collect.Lists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/14/14
 * Time: 12:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class PalindromeTest {

    public static void main(String... arg){
        try {
            List<String> actualString = readFile();
            List<String> reversedString = reverseString(actualString);
            List<String> finalStringList  = checkForPalindrome(actualString,reversedString);

            for (String finalString : finalStringList){
                writePalindromesInAFile(finalString);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static List<String> readFile()throws Exception{
        File file = new File ("C:\\Users\\Admin\\Desktop\\palindromeTest.txt");
        Scanner scanner = new Scanner(file);
        List<String> arrayList = new ArrayList();
        while (scanner.hasNextLine()){
            String inputString = scanner.nextLine();
            String[] splitWithSpace = inputString.split(" ");
            for (String actualString : splitWithSpace){
                arrayList.add(actualString);
            }
        }
        return arrayList;
    }

    private static List<String> reverseString(List<String> listWithActualString){
        List<String> reversedWords = new ArrayList<>() ;

        for (String  actualString : listWithActualString){
            StringBuilder stringBuilder = new StringBuilder(actualString);
            stringBuilder.reverse();
            reversedWords.add(stringBuilder.toString());
        }
        return reversedWords;
    }


    private static List<String> checkForPalindrome(List<String> listOfActualString, List<String> reversedString){
        List<String>  listOfPalindromes  = Lists.newArrayList();
        for (String inputString :  listOfActualString){
            for (String reverseString : reversedString){
                if (inputString.equals(reverseString)){
                    if (!listOfPalindromes.contains(inputString))
                        listOfPalindromes.add(inputString);
                }
            }
        }
        return listOfPalindromes;
    }


    private static void writePalindromesInAFile(String palindrome){
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter( new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\Admin\\Desktop\\Palindromes.txt",true), "utf-8")));
            printWriter.print(palindrome);
            printWriter.println("\n");
        } catch (Exception ex) {
        } finally {
            try {
                printWriter.close();
            }
            catch (Exception ex) {
               ex.printStackTrace();
            }
        }
    }
}
