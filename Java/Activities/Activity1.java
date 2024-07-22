package Activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object for the car class
		Car car = new Car();
		car.make = 2014;
		car.color = "Black";
		car.transmission = "Manual";
		
		//calling methods from Car class
		car.displayCharacteristics();
		car.accelarate();
		car.brake();

	}

}
