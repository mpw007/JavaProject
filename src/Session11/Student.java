package Session11;

public class Student {
	int rollno;
	String Name;
	 static String CollegeName="UCOE"; // allocate memory only one time
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.Name="Milind";
		s1.rollno=101;
		Student s2=new Student();
		s2.Name="Tathagat";
		s2.rollno=102;	
		
		System.out.println(s1.rollno+","+s1.Name+","+Student.CollegeName);
		System.out.println(s2.rollno+","+s2.Name+","+Student.CollegeName);
		
	}
	

}
