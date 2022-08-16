package javalearning;

public class patternprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5,s,spaces;
		for(i=1;i<=n;i++)
		{
			{
			spaces= n-i;
			for(s=1;s<=spaces;s++)
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
				System.out.print("* ");
			{
				System.out.println();
			}
		}
	}
}

