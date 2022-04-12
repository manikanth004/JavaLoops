package LoopStatements;

import java.util.Scanner;

public class Evensmalllarge {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int evenSmall=n/10;
		int evenLarge=0;
		int oddSmall=1;
		int oddLarge=0;
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2==0)
			{
				if(evenSmall>digit)
				{
					evenSmall=digit;
				}
				else 
				{
					
					if(evenLarge<digit)
					{
						evenLarge=digit;
					}
				}
			}
			else
			{
				if(oddSmall>digit)
				{
					oddSmall=digit;
				}
				else 
				{
					
					if(oddLarge<digit)
					{
						oddLarge=digit;
					}
				}
			}
			n/=10;
			
		}
		int evenSum=evenLarge+evenSmall;
		int OddSum=oddLarge+oddSmall;
		if(evenSum==oddSmall)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
			
		}
		
		System.out.println(evenSmall);
		System.out.println(evenLarge);
		System.out.println(oddSmall);
		System.out.println(oddLarge);

	}

}
