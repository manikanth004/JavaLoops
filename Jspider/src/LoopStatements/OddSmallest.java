package LoopStatements;

import java.util.Scanner;

public class OddSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=sc.nextInt();
		int smallest=n%10;
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2!=0)
			{
				if(smallest<digit)
				{
					smallest=digit;
				}
			}
			n/=10;
		}
		System.out.println(smallest);

	}

}
