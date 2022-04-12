package LoopStatements;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M value");
		int m=sc.nextInt();
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" Even"+ " ");
			}
			
			else
			{
				System.out.print(i+" Odd"+" ");
			}
		}
	}

}
