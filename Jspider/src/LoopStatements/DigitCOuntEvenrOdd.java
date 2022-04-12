package LoopStatements;

import java.util.Scanner;

public class DigitCOuntEvenrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Value");
		long num=sc.nextLong();
		
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		if(count%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
