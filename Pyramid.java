package nthDimenzion.ravi.immutable;

public class Pyramid {
	public static void main(String[] args) {
		int n=7;
		int i,j=0;
		for(i=0;i<=n;i++){
			System.out.println();
			for(j=1;j<=i;j++){
				System.out.print(" "+i);
			}
		}
		i--;
		j++;

	}
}
