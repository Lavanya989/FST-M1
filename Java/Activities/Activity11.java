package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> colour = new HashMap<Integer,String>();
		//Adding colours
		colour.put(1, "Red");
		colour.put(2, "Blue");
		colour.put(3, "White");
		colour.put(4, "Yellow");
		colour.put(5, "Orange");
		
		System.out.println("Origina values from Map :" +colour);
		System.out.println("Size of the set : " +colour.size());
		//remove Blue color from the list
		colour.remove(2);
		
		if(colour.containsValue("Green")) {
			System.out.println("The Green color exists");
		} else
		{
			System.out.println("Green color is not available in the list");
		}
		
		//Size of the set
		System.out.println("Size of the set after makign changes: " +colour.size());
		 

	}

}
