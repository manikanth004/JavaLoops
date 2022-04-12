package Practise;

import java.util.Scanner;

public class JspTest3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		char n=sc.next().charAt(0);
		if(n>='a' && n<='z' || n>='A' && n<='Z')
		{
			
				if(n%2==0)
				{
					System.out.println("Assci value is Even");
				}
				else
				{
					System.out.println("Assci value is Odd");
				}
			
		}
		else if(n>='1' && n<='9')
		{
			if(n%2==0)
			{
				System.out.println("Digit is Even");
			}
			else
			{
				System.out.println(" Digit is odd");
			}
		}
		else
		{
			System.out.println("Special character Assci value is :"+(n+0));
		}
		
		
		

	}

}
