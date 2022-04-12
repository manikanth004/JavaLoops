package LoopStatements;

import java.util.Scanner;

public class ValidateMobNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the value");
		int num=sc.nextInt();
		
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		if(count==10)
		{
			System.out.println("Valid Mobile number");
		}
		else
		{
			System.out.println("invalid mobile no");
		}

	}

}
