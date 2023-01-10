package Session19;

public class AbstracBikeClass {

	public static void main(String[] args) {
		
		BikeClass obj1= new Tvs();
		obj1.start();
		obj1.run();
		BikeClass.stop();
		
		obj1= new Yahama();
		obj1.start();
		obj1.run();
		BikeClass.stop();
		
		 obj1= new Honda();
		obj1.start();
		obj1.run();
		BikeClass.stop();
	}

}
