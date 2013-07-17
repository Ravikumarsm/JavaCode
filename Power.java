package NthDimenzion.assignment.NumberTest;

public class Power {
	 
		 static void n(int y,int z)
		    {
		 long result=1;
		 for(int i=0;i<z;i++)
		      {
		 result*=y;
		      }
		 System.out.println("the result of "+y+"^"+z+" is "+result);
		    }
		 public static void main(String arg[])
		   {
		 Power.n(2,5);
		 }
		 }


