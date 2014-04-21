package org.nthdimenzion;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 4/21/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class NumberDisplay {
    public static void main(String... arg){
        int displayTillNumber = 5;
        for (int row =0;row<=displayTillNumber;row++){
            for (int column=1; column<=row;column++){
                if (row==2 && column==1) {
                    System.out.print(". ");
                }else  {
                    System.out.print(column+" ");
                }
            }
            System.out.println();
        }

        for (int row = displayTillNumber-1;row>=0;row--){
            for (int column=1; column<=row;column++){
                if (row==2 && column==1) {
                    System.out.print(". ");
                }  else {
                    System.out.print(column+" ");
            }
            }
            System.out.println();
        }

    }
}
