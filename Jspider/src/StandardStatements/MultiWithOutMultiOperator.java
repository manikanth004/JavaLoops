package StandardStatements;

import java.util.Scanner;

public class MultiWithOutMultiOperator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(1==1) {
		System.out.println("Enter the Table You Want");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(n+"*"+i+"="+(sum+=n));
		}


		
		System.out.println("For Continuation Press 1");
		int x=sc.nextInt();
		if(x==1)
		{
			continue;
		}
		else {
			break;
		}
		}

	}

}
