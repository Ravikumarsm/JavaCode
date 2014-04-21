package org.nthdimenzion;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/11/14
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class WordCount {

    public static void main(String... arg){
       /* String str = "When there is a hole; there is a chance to get in then there creates problem.";*/
        try {
            File file = new File ("C:\\Users\\Admin\\Desktop\\test.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String inputString = scanner.nextLine();
                String[] splitStr = inputString.split(" ");

                Map<String, Integer> wordCount = countTheWordWithOccurrence(splitStr);

                for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                    System.out.println(entry.getKey()+ " - " + entry.getValue());
                }
            }
        }
        catch (Exception e){
               e.printStackTrace();
        }

    }

    private static Map<String, Integer> countTheWordWithOccurrence(String[] splitStr) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : splitStr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }

}
