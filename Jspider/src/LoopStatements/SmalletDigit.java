package LoopStatements;

import java.util.Scanner;

public class SmalletDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int smallest=n%10;
		while(n!=0)
		{
			int digit=n%10;
			if(smallest>digit)
			{
				smallest=digit;
			}
			n/=10;
		}
	System.out.println(smallest);
	}

}
