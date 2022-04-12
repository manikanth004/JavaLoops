package LoopStatements;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int largest=n%10;
		while(n!=0)
		{
			int digit=n%10;
			if(largest<digit)
			{
				largest=digit;
			}
			n/=10;
		}
	System.out.println(largest);	
	}

}
