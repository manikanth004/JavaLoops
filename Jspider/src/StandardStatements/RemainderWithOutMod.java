package StandardStatements;

import java.util.Scanner;

public class RemainderWithOutMod {

	public static void main(String[] args) 
	{
	

		Scanner sc=new Scanner(System.in);
		while(1==1) {
		System.out.println("Enter The Divident");
		int divident=sc.nextInt();
		System.out.println("Enter the Divisor");
		int divisor=sc.nextInt();
		while(divident>=divisor)
		{
			divident-=divisor;
		}
		System.out.println(divident);
		
		
		
	}
		}

}
