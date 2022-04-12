package Practise;

import java.util.Scanner;

public class JspTest5 {

	public static void main(String[] args) 
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int largest=0;
		int smallest=9;
		while(n!=0)
		{
			int digit=n%10;
			if(smallest>digit)
			{
				smallest=digit;
			}
			if(largest<digit)
			{
				largest=digit;
			}
			n/=10;
		}
		System.out.println("The Smallest digit of Given no is"+smallest);
		System.out.println("The Largest digit of Given no is"+largest);
		

	}

}
