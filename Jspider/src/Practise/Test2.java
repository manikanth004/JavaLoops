package Practise;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Pizzas");
		int pizcount=sc.nextInt();

		System.out.println("Enter no of Puffs");
		int puffCount=sc.nextInt();
		
		System.out.println("Enter no of Cooldrinks");
		int cooldrCost=sc.nextInt();
		
	
		int pizzaPrize=100;
		int puffPrize=20;
		int cooldrPrize=10;
		
		int pizcost=pizcount*pizzaPrize;
		int puffcost=puffCount*puffPrize;
		int coolcost=cooldrCost*cooldrPrize;
		
		System.out.println(pizcost);
		System.out.println(puffcost);
		System.out.println(coolcost);
		System.out.println(pizcost+puffcost+coolcost);

	}

}
