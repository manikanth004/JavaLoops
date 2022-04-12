package Practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment {
	/*
	 * wap to print the multiplication table for an no.
	 * 
	 * wap to print and count the no. which are dvisible by 3 and 5 and 7 b/w m and n and
	 *  find the summation of that no.s and prit the no. in descemding order in Horizonaral way
	 *   and consider the nos to print which are greater than to 6
	 *
	 *wap to check he given char is if its alphabet check assci value is even r odd,//
	 *if it is digit check the digit is even or odd if it is spl char print the assci value//
	 *
	 *wap to print sum of even nos last digits summ b/w m and n//
	 *
	 *wap to print largest and smallest digit in the no.//
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) 
	{
		
		Set hashSet=new HashSet();
		
		
		hashSet.add("Manikanth");
		hashSet.add("Mani");
		hashSet.add("Dasa");
		hashSet.add("Ma");

		Iterator iterator=hashSet.iterator();
		System.out.println(hashSet);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		}

}
