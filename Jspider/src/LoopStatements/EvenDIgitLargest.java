package LoopStatements;

import java.util.Scanner;

public class EvenDIgitLargest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int largest=0;
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2==0) {
			if(largest<digit)
			{
				largest=digit;
			}
			}
			n/=10;
		}
	System.out.println(largest);

	}

}