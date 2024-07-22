package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize array
		int[] num = {10, 77, 10, 54, -11, 10};
		
		
		int expectedNumber  = 30;
		int tempSum=0;
System.out.println("Original Array values :" +Arrays.toString(num));		
		
		
	//Loop through array
for (int number : num) {
    //If value is 10
    if (number == 10) {
        //Add them
        tempSum = tempSum+number;
    }
} 
		
		if(tempSum == expectedNumber) {
			System.out.println("The Result is : " +tempSum);
		}
		else {
			System.out.println("The value is not 30");
		}

	}

}

