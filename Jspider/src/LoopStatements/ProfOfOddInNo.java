package LoopStatements;

import java.util.Scanner;

public class ProfOfOddInNo {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int prod=1;
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2!=0)
			{
				prod*=digit;
			}
			n/=10;
			
			
		}
		System.out.println(prod);
	}

}
