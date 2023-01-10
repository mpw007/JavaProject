package Session02;

public class Operation {
	public static void main(String[] args) {
		int a=40;
		int b=20;
		//Arithmetic operator
		System.out.println(a+b); //60
		System.out.println(a-b); //20
		System.out.println(a*b); //800
		System.out.println(a/b); //2
		System.out.println(a%b); //0
		System.out.println(a++); // first print 40 then incremrnt 41
		System.out.println(++a);  //first incement 42 then print 42
		
		//Conditional Operator Return only true or False
		System.out.println(a<b); //false
		System.out.println(a>b); //true
		System.out.println(a<=b); //false
		System.out.println(a>=b); //true
		System.out.println(a==b); //false
		System.out.println(a!=b);  //true
		
		//logical operator and && ,or || Not !
		
		boolean x=false;
		boolean y= false;
		System.out.println("-----logical operator and && ,or || Not !--------");
				
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		
		//conditional or ternary operator
		//type variable =condition ? value1:value2=ue2
		int minimum=a<b?a:b;
		System.out.println("minimum:"+minimum);
		}

}
