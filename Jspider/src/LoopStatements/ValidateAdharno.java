package LoopStatements;

import java.util.Scanner;

public class ValidateAdharno
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Adhar number");
		long num=sc.nextLong();
		
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		if(count==12)
		{
			System.out.println("Valid Adhar nUmber");
		}
		else
		{
			System.out.println("Invalid adhar number");
		}
	}

}
