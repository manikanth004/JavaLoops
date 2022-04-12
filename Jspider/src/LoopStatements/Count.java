package LoopStatements;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the value");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
			
		}
		System.out.println("The count of "+temp +" is "+count);

	}

}
