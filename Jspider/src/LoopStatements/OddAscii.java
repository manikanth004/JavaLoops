package LoopStatements;

public class OddAscii {

	public static void main(String[] args) {


		for(char ch='Z';ch>='A';ch--)
		{
			if(ch%2!=0)
			{
				System.out.print(ch+" ");
			}
		}

	}

}
