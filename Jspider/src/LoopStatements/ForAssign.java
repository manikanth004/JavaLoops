package LoopStatements;

import java.util.Scanner;

public class ForAssign {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M value");
		int m=sc.nextInt();
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=m;i<=n;i++)
		{
			if(i%3==0 && i%7==0)
			{
				
				sum+=i;
				count++;
			}
			
		}
		System.out.println(sum);
		System.out.println(count);



	}

}
