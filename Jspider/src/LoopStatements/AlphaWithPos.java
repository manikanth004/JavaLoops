package LoopStatements;

import java.util.Scanner;

public class AlphaWithPos {

	public static void main(String[] args) {
		
		int pos=1;
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+"-->"+pos++);
		}
	}

}
