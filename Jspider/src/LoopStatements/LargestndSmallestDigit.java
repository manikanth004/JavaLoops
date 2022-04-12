package LoopStatements;

import java.util.Scanner;

public class LargestndSmallestDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int largest=n%10;
		int smallest=n%10;
		
		while(n!=0)
		{
			int digit=n%10;
			if(largest<digit)
			{
				largest=digit;
			}
			if(smallest>digit)
			{
				smallest=digit;
			}
			
			n/=10;
		}
	System.out.println(largest);
	System.out.println(smallest);
	}

}
