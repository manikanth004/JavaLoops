package LoopStatements;

import java.util.Scanner;

public class ForLoop4 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m value");
		int m=sc.nextInt();
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(i%5==2 && i%7==0) 
			{
				
				System.out.println(i);
			}
			
		}
	}

}
