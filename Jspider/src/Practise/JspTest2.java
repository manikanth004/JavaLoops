package Practise;

import java.util.Scanner;

public class JspTest2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m Value");
		int m=sc.nextInt();
		System.out.println("Enter the n Value");
		int n=sc.nextInt();
		int count=0;
		int sum=0;
		
		for(int i=m;i>=n;i--)
		{
			if(i%3==0 && i%5==0 && i%7==0)
			{
				if(i>6) {
				count++;
				sum+=i;
				System.out.print(i+ " ");
				}
				else
				{
					System.out.println("Not greater than 6");
				}
			}
			
		}
		System.out.println();
		System.out.println("Summation of numbers divisible by 3,5 and 7 is : "+sum);
		System.out.println("Count of numbers divisible by 3,5 and 7 is :"+count);
		

	}

}
