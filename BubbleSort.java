package NthDimenzion.assignment.sorting;

public class BubbleSort {
	
		public void bub(int a[]){
		{
		int n=a.length;
		for(int j=1;j<n;j++)
		{
			for(int i=0;i<n-j;i++)
			{
				if(a[i]>a[i+1])
				{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				}
			}
		}
		System.out.println("The sorted items are\n");
			for(int i=0;i<n;i++)
			{
			System.out.println(a[i]);
			}
		}
		}
			public static void main(String [] args)
			{
			BubbleSort b= new BubbleSort();
			int [] a=new int[]{1,7,9,4,7};
			b.bub(a);
			}
		
		
		}
		
