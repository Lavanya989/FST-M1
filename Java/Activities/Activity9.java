package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String args[]){   

    List <String> myList = new ArrayList<>();

     myList.add("kala");
     myList.add("lalitha");
     myList.add("Haritha");
     myList.add("kalyani");
     myList.add("Lavanya");

   for(String name : myList){     
    System.out.println("List from Mylist : " + name);
   }

   System.out.println("Thirs element from the list: " + myList.get(2));
   System.out.println("Checking Lavanya: " +myList.contains("Lavanya"));
  
   System.out.println(myList.size());
   myList.remove("Haritha");
   System.out.println(myList.size());

   

}
}
