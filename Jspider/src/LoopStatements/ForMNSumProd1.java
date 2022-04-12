package LoopStatements;

import java.util.Scanner;

public class ForMNSumProd1 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M value");
		int m=sc.nextInt();
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		for(int i=m;i<=n;i++)
		{
			sum+=i;
			prod*=i;
		}

		System.out.println(sum);
		System.out.println(prod);
	}

}
