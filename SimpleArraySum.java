package hackerRank;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr={1,2,3,4,5,6};
		int sum=0;
		/*Scanner s=new Scanner(System.in);
		int []a=new int[5];
		for(int j=0;j<a.length;j++)
		{
			a[j]=s.nextInt();
		}*/
		
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
	System.out.println(sum);
	}

}
