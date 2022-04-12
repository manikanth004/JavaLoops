package LoopStatements;

import java.util.Scanner;

public class ProdOfEvenOddrEqual {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the value");

		int n=sc.nextInt();
		int prodEven=1;
		int prodOdd=1;
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2==0)
			{
				prodEven*=digit;
			}
			else
			{
				prodOdd*=digit;
				
			}
			n/=10;
		}
		int prod=prodEven*prodOdd;
		if(prod%2==0)
		{
			System.out.println(prod+" Even");
		}
		else
		{
			System.out.println(prod+" Odd");
		}
	}

}
