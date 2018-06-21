package hackerRank;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum1=0,sum2=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values to  rows and cols");
		//n=s.nextInt();
		int a[][]=new int[3][3];
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		/*for(int i = 0, j = a.length; i < a.length; i++, j--){
		    sum1 += a[i][i];
		    sum2 += a[j][i];
		}*/
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i][i];
			sum2 += a[(3-1)-i][i];
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum1-sum2);
	}

}
