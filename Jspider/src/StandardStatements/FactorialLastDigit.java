package StandardStatements;

import java.util.Scanner;

public class FactorialLastDigit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int m=sc.nextInt();
		System.out.println("Enter the Value");
		int n=sc.nextInt();
		int prod=1;
		for(int i=m;i<=n;i++)
		{
			prod*=i;
		}
		System.out.println(prod);
		
		int digit=prod%10;
		System.out.println(digit);
		
	

	}

}
