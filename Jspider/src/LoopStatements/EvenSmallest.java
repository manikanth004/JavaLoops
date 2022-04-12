package LoopStatements;

import java.util.Scanner;

public class EvenSmallest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=sc.nextInt();
		int smallest=2;
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2==0)
			{
				if(smallest>digit)
				{
					smallest=digit;
				}
			}
			n/=10;
		}
		System.out.println(smallest);

	}

}
