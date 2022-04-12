package StandardStatements;

import java.util.Scanner;

public class QuotientWithOutDivision {

	public static void main(String[] args) 
	{
	


		Scanner sc=new Scanner(System.in);
		while(1==1) {
		System.out.println("Enter The Divident");
		int divident=sc.nextInt();
		System.out.println("Enter the Divisor");
		int divisor=sc.nextInt();
		int count=0;
		while(divident>=divisor)
		{
			count++;
			divident-=divisor;
		}
		System.out.println(count);
		
		}
		
	}

}
