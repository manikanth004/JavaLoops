package LoopStatements;

import java.util.Scanner;

public class AlphaByPosi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pos Value");
		int pos=sc.nextInt();
		
		if(pos>=1 && pos<=26)
		{
		int count=0;
		
		for(char ch='a';ch<='z';ch++)
		{
			count++;
			if(count==pos)
			{
				System.out.println(ch);
			}
		}
		}
		else
		{
			System.out.println("Invalid position ");
		}
		

	}

}
