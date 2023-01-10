package Session05;

public class ArraySingleDimesional {
	public static void main(String[] args) {
		// declaration and intilization  on one line
		/*int [] roll =  new int[5];
		roll[0]=11;
		roll[1]=12;
		roll[2]=13;
		roll[3]=14;
		roll[4]=15;*/
		
		int [] roll= {11,12,13,14,15};
		
		//Size of aaray
		System.out.println("size of aaray:"+roll.length);
		
		//raed aaray value
		
		for(int i=0;i<roll.length;i++)
		{
			System.out.println(roll[i]);
		}
		
		//extend for loop
		for(int a:roll)
		{
			System.out.println(a);
		}
		
	}

}
