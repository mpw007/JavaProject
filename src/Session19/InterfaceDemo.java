package Session19;

interface showAge{
	
	void showage(int age);
	//int age=10; final and static is allowed

}
interface showName{
	
	void showname(String name);
	//int age=10; final and static is allowed

}


public class InterfaceDemo implements showAge,showName {
	
	public void showname(String name) {
		System.out.println("Name is:"+name);
		
	}
	public void showage(int age) {
		System.out.println("Age is:"+age);
		
	}

	public static void main(String[] args) {
		
		InterfaceDemo obj=new InterfaceDemo();
		obj.showage(23);
		obj.showname("Milind");
		// TODO Auto-generated method stub

	}

}
