package Practise;

class number
{
	private int length;
	private int breath;
	
	public number(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}
	
	
	
}
public class Encapsulation2
{
	public static void main(String[]args) 
	{
		number n=new number(12, 12);
		int len=n.getLength();
		int bre=n.getBreath();
		
		int area=len*bre;
		System.out.println(area);
		
		
		n.setBreath(12);
		n.setLength(11);
		
		int a=n.getBreath();
		int b=n.getLength();
		
		int newarea=a*b;
		System.out.println(newarea);
		
		
		
		
		
		
	}
	
}







