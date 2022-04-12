package StandardStatements;

import java.util.Scanner;

public class MultiTableOfSum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m Value");
		int m=sc.nextInt();
		System.out.println("Enter n Value");
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum+=i;	
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(sum+"*"+i+"="+(sum*i));
		}
		
				


	}

}
