package LoopStatements;

import java.util.Scanner;

public class SumIsAlphaOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M  value");
		int m=sc.nextInt();
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		if(sum>='a' && sum<='z' || sum>='A' && sum<='Z')
		{
			if(sum>='a' && sum<='z')
			{
				for(char ch='a';ch<='z';ch++)
				{
					if(ch==sum) 
					{
						System.out.println(ch);
						
					}
				}
			}
			else
			{
				for(char ch='A';ch<='Z';ch++)
				{
					if(ch==sum)
					{
						System.out.println(ch);
					}
				}
			}
		}
		else
		{
			if(sum%2==0)
			{
				System.out.println("Sum is Even");
			}
			else
			{
				System.out.println("Sum is Odd");
				
			}
		}
	}

}
