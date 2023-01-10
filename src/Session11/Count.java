package Session11;

public class Count {
	
	 // int count=0;
		static   int count=0;
	Count(){
		
		count++;
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Count obj1 =new Count();
		Count obj2 =new Count();
		Count obj3 =new Count();
	}

}
