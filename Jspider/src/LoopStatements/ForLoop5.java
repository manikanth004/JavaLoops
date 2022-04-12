package LoopStatements;

import java.util.Scanner;

public class ForLoop5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m value");
		int m=sc.nextInt();
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int count=0;
		for(int i=m;i>=n;i--)
		{
			if(i%3==0 && i%7==0) 
			{
				
				System.out.println(i);
				count++;
			}
			
		}

	}

}
