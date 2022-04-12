package LoopStatements;

import java.util.Scanner;

public class PosByAlph {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter   char Value");
		char ch=sc.next().charAt(0);
		
		int pos=0;
		for(char cha='a';cha<='z';cha++)
		{
			pos++;
			if(pos==cha) {
				System.out.println(pos);
				break;
			}
		}
		
	}

}
