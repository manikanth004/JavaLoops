package LoopStatements;

import java.util.Scanner;

public class SumChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m Value");
		int m=sc.nextInt();
		System.out.println("Enter N Value");
		int n=sc.nextInt();
		int sum=0;
		int pos;
		for(int i=m;i<=n;i++)
		{
			sum+=i;
			
		}
		pos=sum%10;
		int count=0;
		if(pos>=1 && pos<=26)
		{
		for(char ch='A';ch<='Z';ch++)
		{
			count++;
			if(count==pos)
			{
				System.out.println(ch);
				break;
			}
		}
		}
		else
		{
			System.out.println("Invalid position");
		}


	}

}
