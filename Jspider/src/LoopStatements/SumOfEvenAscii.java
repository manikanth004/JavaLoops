package LoopStatements;

import java.util.Scanner;

public class SumOfEvenAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M Alphabate value");
		char m=sc.next().charAt(0);
		System.out.println("Enter the N Alphabate value");
		char n=sc.next().charAt(0);
		int sum=0;
		for(char ch=m;ch<=n;ch++)
		{
			if(ch%2==0)
			{
				sum+=ch;
			}
		}
		System.out.println(sum);
	}

}
