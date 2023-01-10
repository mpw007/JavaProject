package Session04;

public class ForLoop {
	public static void main(String[] args) {
		
	System.out.println("for for loop");
	
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
	
	System.out.println("for break stesment");
	
	//for break
	for(int j=0;j<=10;j++)
	{
		if(j==5)
			break;
		System.out.println(j);
	}
	
	System.out.println("for continue");
	
	
	//for continue
	
	for(int k=0;k<=10;k++)
	{
		if(k==5)
			continue;
		System.out.println(k);
	}
	}
}
