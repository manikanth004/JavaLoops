package StandardStatements;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplicationOfN {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table You Want");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		// TODO Auto-generated method stub

	}

}
