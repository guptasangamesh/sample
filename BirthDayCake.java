package hackerRank;

import java.util.Scanner;

public class BirthDayCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
 int count=0;
		   System.out.println("enter the age of birthday person");
             int n=s.nextInt();		
		int []a=new int[n];
	      System.out.println("enter birthday candel numbers"); 
	        for(int i=0;i<a.length;i++)
	        {
	        	a[i]=s.nextInt();
	        }
	    int max=a[0];   
	        for(int i=0; i<a.length; i++)
	        {
	            if(a[i] > max)
	                max = a[i];
	        }
	            for(int i = 0; i < a.length; i++)
	            {   if (a[i] == max)
	                count++;
	                  }
	            System.out.println(count);
	}

}
