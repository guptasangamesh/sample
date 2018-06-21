package hackerRank;

import java.util.Scanner;

public class kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter the position of 1st kangaroo");
    int x=s.nextInt();
    System.out.println("enter the position of 2st kangaroo");
    int x1=s.nextInt();
    System.out.println("enter the speed of 1st kangaroo");
    int sp=s.nextInt();
    System.out.println("enter the speed of 2st kangaroo");
    int sp1=s.nextInt();
	
	
	int y=x+sp;
	int y1=x1+sp1;
	if(y==y1)
	{
		System.out.println("true");
	}
	else{System.out.println("false");	
	}
	}
}
