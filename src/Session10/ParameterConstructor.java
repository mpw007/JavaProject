package Session10;

public class ParameterConstructor {
	
	static String name;
	static int year;
	
	ParameterConstructor(String cname, int yea){
		name=cname;
		year=yea;
	}
	
	void displayData() {
		System.out.println(name+" "+ year);
	}
	public static void main(String[] args) {
		ParameterConstructor obj=new ParameterConstructor("Santro", 2020);
		obj.displayData();
	}
}
