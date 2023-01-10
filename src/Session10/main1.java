package Session10;

import Session09.SecondClass;

public class main1 {
	public static void main(String [] args)
	{
		
		// TODO Auto-generated constructor stub
		
		FirstClass obj1=new FirstClass("Santro", 2020);
		SecondClass obj2=new SecondClass("Santro", 2020);
		System.out.println(obj1.name+" "+obj1.year);
		System.out.println(obj2.name+" "+obj2.getYear());
		
	}

}
