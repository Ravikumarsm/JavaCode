package org.nthdimenzion;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/21/14
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class SubSequenceTest {

    public static void main(String... str) {
        int  inputArray[] = new int[] { 7, 2, 3, 1, 5, 8, 9, 6 };
        int next[] = new int[inputArray.length];
        int prev[] = new int[inputArray.length];
        int maxLength = 0;
        int  maxIndex = -1;

        next[0] = 1;
        prev[0] = -1;

        for (int i = 1; i < inputArray.length; i++)
        {
            next[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++)
            {
                if (inputArray[i] > inputArray[j] && next[j] + 1 > next[i])
                {
                    next[i] = next[j] + 1;
                    prev[i] = j;
                }
            }

            if (next[i] > maxLength)
            {
                maxLength = next[i];
                maxIndex = i;
            }
        }

        StringBuilder stringBuffer = new StringBuilder();
        int currentIndex = maxIndex;

        while (currentIndex != -1)
        {
            stringBuffer.insert(0, inputArray[currentIndex] + " ");
            currentIndex = prev[currentIndex];
        }
        System.out.println(stringBuffer.toString());
        System.out.println("Max length is : "+maxLength);
    }
}
