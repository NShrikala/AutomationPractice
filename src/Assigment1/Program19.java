package Assigment1;

public class Program19 {

	public static void main(String[] args) {
		
        int [] arr =  {5, 2, 8, 7, 1};    
        int temp = 0;  
            
          
        //Sort the array in ascending order  
        for (int i = 0; i < arr.length; i++) {  
        	
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] > arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        }  
        
        System.out.println("2nd Smallest Number is :- "+ arr[1]);  
          
        
		
	}

}
