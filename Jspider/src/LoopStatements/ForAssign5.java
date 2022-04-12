package LoopStatements;

public class ForAssign5 {
	
	/*
	 * wap to print uppercase alphabate with their position in horizontal way
	 * wap to print uppercase alphabate with their ascii value in horizontal way in reversing order
	 * wap to print even and odd nos btw m and n in horizontal way
	 * wap to print summation of even ascii alphabates 
	 * wap to print lowercasw alphabate if the summation is even else print uppercase alpahabte
	 */

	public static void main(String[] args) 
	{
		int pos=1;
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+"---->" +pos++);
		}


	}

}
