package Activities;


import java.util.ArrayList;

import java.util.Date;
import java.util.List;

class Plane {
    public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
    
    //Creating constructor
    Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<String>();
    	
           }
    public void onBoard(String passengers) {
		this.passengers.add(passengers);
       }
    
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded = lastTimeTookOf;
    	this.passengers.clear();
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
    }
    
    public List<String> getPassengers() {
    	return passengers;
    }
    	
   }
    

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create an object
		Plane plane = new Plane(10);
		plane.onBoard("Lavanya");
		plane.onBoard("Kanth");
		plane.onBoard("Kiaan");
		plane.onBoard("Krish");
		
		System.out.println("Take off time is :" +plane.takeOff());
		System.out.println("All the passengers names : " +plane.getPassengers());
		Thread.sleep(2000);
		plane.land();
		System.out.println("Flight Landing time :" +plane.getLastTimeLanded() );
		
		System.out.println("Passengers on the plane after landing : " +plane.getPassengers());

	}

}
