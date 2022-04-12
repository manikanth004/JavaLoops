package Practise;

import java.util.Scanner;

public class Extend {
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("ENter the value");
		  int n=sc.nextInt();
		  while(n!=0)
		  {
			  int digit=n%10;
			  System.out.print(digit);
			  n/=10;
		  }
		  
		 
		  
		
		 
			
	}
}
