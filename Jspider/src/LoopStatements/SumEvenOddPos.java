package LoopStatements;

import java.util.Scanner;

public class SumEvenOddPos {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M  value");
		int m=sc.nextInt();
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=m;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		if(sum>=1 && sum<=26)
		{
		if(sum%2==0)
		{
			
			for(char ch='a';ch<='z';ch++)
			{
				count++;
				if(count==sum) {
					
					System.out.println(ch);
				}
			}
		}
		else
		{
			
			for(char ch='A';ch<='Z';ch++)
			{
				count++;
				if(count==sum) {
					
					System.out.println(ch);
				}
			}
		}
		}
		else {
			System.out.println("Invalid Position");
		}
	

	}

}
