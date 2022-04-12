package Practise;

import java.util.Scanner;

public class JspTest1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the table u want");
	
		int e=sc.nextInt();
		int value;
		for(int i=1;i<=10;i++)
		{
			
			value=e*i;
			System.out.println(e+"x"+i+"="+value);
		}
		
		
		

	}

}
