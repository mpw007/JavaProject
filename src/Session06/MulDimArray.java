package Session06;

public class MulDimArray {
	public static void main(String[] args) {
		//declare and intlisiation 
		int [][] a=new int[3][2];//one Way
		int [][] b= {{1,2},{3,4},{5,6},{7,8}};//Second Way not necessary define size
		
		a[0][0]=12;
		a[0][1]=13;
		a[1][0]=14;
		a[1][1]=15;
		a[2][0]=16;
		a[2][1]=17;
		
		//length of aaray
		System.out.println("row length::"+a.length);
		
		//cloum length
		System.out.println("coloum lenght::"+a[0].length);
		
		//read array value
		for(int i=0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Second Way OutPut");
		//length of aaray
				System.out.println("row length::"+b.length);
				
				//cloum length
				System.out.println("coloum lenght::"+b[0].length);
				
				//read array value
				for(int i=0;i<b.length;i++) {
					for(int j = 0;j<b[0].length;j++) {
						System.out.print(b[i][j]+" ");
					}
					System.out.println();
				}
		
		
		
	}

}
