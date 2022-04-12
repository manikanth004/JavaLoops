package Practise;

import java.util.*;

class Test{
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Quantity of Diesel to fill the Tank");
		int quantit=sc.nextInt();
		System.out.println("Enter the Distance cover till it dry");
		int mileage=sc.nextInt();
		if(quantit>=0 && mileage>=0) {
		
		int mil=	(quantit/150)*100;
		float miles=(mileage*0.6214f);
		float galon=(quantit*0.2642f);
		float us=miles/galon;
	System.out.println(us);
		
		
		
		
		
		
		
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}

 
