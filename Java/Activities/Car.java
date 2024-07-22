package Activities;

public class Car {
	String color, transmission;
	int make, tyres,doors;
	
	//Create Constructor
	
	Car(){
		
		tyres = 4;
		doors = 4;
		
	}
	
	
	public void displayCharacteristics() {
		System.out.println("Car color is :" + color);
		System.out.println("Car is made in : " +make);
		System.out.println("Total types for the car : " + tyres);
		System.out.println("Total doors for the car : " +doors);
		System.out.println("Transmission for the car : " +transmission);
		
	}
	
	public void accelarate() {
		System.out.println("Car movering forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
}



