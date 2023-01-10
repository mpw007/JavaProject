package Session10;

public class Constructor {
	int x;
	
	// constructor not be abstract,final, does not return type;
	Constructor(){
		x=10;
	}
	public static void main(String[] args) {
		
		Constructor obj= new Constructor();//call constructor
		System.out.println(obj.x);
		
	}

}
