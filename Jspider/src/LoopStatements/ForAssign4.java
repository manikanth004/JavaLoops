package LoopStatements;

public class ForAssign4 {

	public static void main(String[] args) 
	{
		/*
		 * for(char ch='A';ch<='Z';ch++) { if(ch%2==0) { System.out.println(ch+
		 * " "+(int)(ch)); } }
		 */
	
		int a=10;
		int b=20;
		int c;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(b);
		
	}

}
