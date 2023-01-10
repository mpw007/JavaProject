package Session09;

public class StaticVariable {

	static int age = 10;

	// Define static method
	static void display() {
		System.out.println("Age:" + age);
	}

	// define NonStatic Method
	void sum(int a, int b) {
		System.out.println(a + b);

	}
	
	// Return in method
	int mul(int a, int b) {
		return a*b;

	}
	
	//return in between
	int small(int a,int b) {
		if(a<b)
		return a;
		else
		return b;
		
	}

	public static void main(String[] args) {
		// access static method without object
		display();

		// access Non static method with object reference
		StaticVariable sv = new StaticVariable();
		sv.sum(10, 10);
		System.out.println("Multiplication:"+sv.mul(10,10));
		System.out.println("Smaller Number:"+sv.small(20, 30));

}
}
