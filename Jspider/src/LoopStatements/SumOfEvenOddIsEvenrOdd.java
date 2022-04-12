package LoopStatements;

import java.util.Scanner;

public class SumOfEvenOddIsEvenrOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=sc.nextInt();
		int sumEven=0;
		int sumOdd=0;
		
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2==0)
			{
				sumEven+=digit;
				
			}
			else
			{
				sumOdd+=digit;
				
			}
			n/=10;
		}
		int sum=sumEven+sumOdd;
		if(sum%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
