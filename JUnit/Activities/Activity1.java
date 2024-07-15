package Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Activity1 {

	 static ArrayList<String> list;
	 
	 @BeforeEach
	 public void setUp() {
		 list = new ArrayList<String>();
		 
		 list.add("lavanya");//at index 0
		 list.add("Kanth"); //at index 1
		 	 }
	 
	 @Test
	 public void insertTest() {		
		 assertEquals(2, list.size(),"Wrong size");
		  list.add(2, "charlie");
	        // Assert with new elements
	        assertEquals(3, list.size(), "Wrong size");
	        
	      
	 }
	 
	 @Test
	 public void replaceTest() {
		 list.add("Kiaan");
		 assertEquals(3, list.size());
		 list.set(1, "Kala");
	 }
	 
	 
}
