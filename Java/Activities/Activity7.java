package Activities;

interface BicycleParts{
	public int gears = 0;
	public int speed = 0;
}

interface BicycleOperation{
	public void applyBrake(int decrement) ;
	public void speedUp(int increment); 
}



 class Bicycle implements BicycleParts, BicycleOperation{
	 public int gears;
	 public int currentSpeed;
	 
	 public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }
	 public void applyBrake(int decrement) {
	        currentSpeed -= decrement;
	        System.out.println("Current speed: " + currentSpeed);
	    }
	 public void speedUp(int increment) {
	        currentSpeed += increment;
	        System.out.println("Current speed: " + currentSpeed);
	    }
	 public String bicycleDesc() {
	        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	    }
}
 
class MountainBike extends Bicycle {
	 
	 public int seatHeight;
	 public MountainBike(int gears, int currentSpeed, int startHeight) {
	        //Invoking base-class(Bicycle) constructor
	        super(gears, currentSpeed);
	        seatHeight = startHeight;
	    }
	 public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    public String bicycleDesc() {
	        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	    }  
 }

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MountainBike mountainBike = new MountainBike(3, 0, 25);
	        System.out.println(mountainBike.bicycleDesc());
	        mountainBike.speedUp(20);
	        mountainBike.applyBrake(5);

	}

}
