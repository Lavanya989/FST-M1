package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,8,10,22,1,3,29,30,32};
		System.out.println("Array values before sorting : " +Arrays.toString(arr));
		
		
		
		int temp;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				
			   if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;										
			   }
		
		    }
	    }		
		
	System.out.println("Array values after sorting : " +Arrays.toString(arr));
					
		}		
			
			

	}


