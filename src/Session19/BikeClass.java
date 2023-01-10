package Session19;

public abstract  class BikeClass {
	
	BikeClass(){
		System.out.println("Bike Class created...");
	}
	
	 abstract  void run();
	 
	 void start() {
		 System.out.println("Bike satarted....");
	 }
	static  void stop() {
		 System.out.println("Bike Stoped....");
	 }

}
