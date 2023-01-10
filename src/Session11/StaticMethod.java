package Session11;

public class StaticMethod {

	int rollno;
	String Name;

	static String colname = "ucoe";

	public StaticMethod(int roll, String name) {
		rollno = roll;
		Name = name;

	}

	static void change() {
		//rollno=10;
		colname ="kdk";
	}

	void display() {
		System.out.println(rollno + "," + Name + "," + colname);
	}

	public static void main(String[] args) {
		StaticMethod obj1 = new StaticMethod(101, "Ram");
		StaticMethod obj2 = new StaticMethod(102, "Ramrao");
		obj1.display();
		obj2.display();
		change();
		System.out.println("After Change");
		obj1.display();
		obj2.display();

	}

}
