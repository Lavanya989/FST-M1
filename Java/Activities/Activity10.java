package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> sh = new HashSet<String>();
		sh.add("Vinaya");
		sh.add("Vidheya");
		sh.add("Rama");
		sh.add("Sita");
		sh.add("Kalki");
		sh.add("House");
		
		System.out.println("The size of the HashSet is :" +sh.size());
		System.out.println("The elements are : " +sh);
		sh.remove("Kalki");
		System.out.println("After removing one element, the size of the HashSet is :" +sh.size());
		
        //Remove element that is not present
        if(sh.remove("China")) {
        	System.out.println("China removed from the Set");
        } else {
        	System.out.println("China is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if India is present in the set: " + sh.contains("India"));
		System.out.println("After making changes, the elements are :" +sh);
		
	}

}
