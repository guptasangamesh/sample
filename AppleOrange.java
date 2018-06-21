package hackerRank;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int apples=0;int oranges=0;
		System.out.println("Enter the house positions start and end values");
		System.out.print("start");
		int s=scan.nextInt();
		System.out.print("end");
		int t=scan.nextInt();
		System.out.println("Enter the apple tree position");
		System.out.print("appletree=");
		int a=scan.nextInt();
		System.out.println("Enter the orange tree position");
		System.out.print("orange tree=");
		int b=scan.nextInt();
		System.out.println("Enter the NO.of apples fell down");
		System.out.print("app=");
		int m=scan.nextInt();
		System.out.println("Enter the NO.of Oranges fell down");
		System.out.print("oran=");
		int n=scan.nextInt();
		System.out.println("Enter the postions of apples");
		int apple[]=new int[m];
		for(int i=0;i<apple.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" apple position");
			apple[i]=scan.nextInt();
		}
		System.out.println("Enter the postions of oranges");
		int orange[]=new int[n];
		for(int i=0;i<orange.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" orange position :");
			orange[i]=scan.nextInt();
		}
		for(int i=0;i<apple.length;i++)
		{
			if(a-apple[i]>=s&&a-apple[i]<=t)
			{
				apples++;
			}
		}
		for(int i=0;i<orange.length;i++)
		{
			if((b-orange[i])>=s&&(b-orange[i])<=t)
			{
				oranges++;
			}
		}
		System.out.println("Number of apples that fall on chitti's house= "+apples);
		System.out.println("Number of oranges that fall on chitti's house= "+oranges);
		
		
	}

}
