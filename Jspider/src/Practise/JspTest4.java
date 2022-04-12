package Practise;

import java.util.Scanner;

public class JspTest4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m value");
		int m=sc.nextInt();
		System.out.println("Enter the  nvalue");
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				
				int digit=i%10;
				sum+=digit;
			}
			
		}
		System.out.println(sum);
		

	}

}
