package LoopStatements;

import java.util.Scanner;

public class ValidAccno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Account number");
		long num=sc.nextLong();
		
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		if(count>11 && count<=16)
		{
			System.out.println("Valid Account nUmber");
		}
		else
		{
			System.out.println("Invalid Account number");
		}
	}

}
