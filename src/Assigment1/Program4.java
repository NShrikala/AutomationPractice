package Assigment1;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//            0  1  2  3  4  5  6  7  8  9
		int arr[] = {10,20,20,30,40,50,50,60,60,60};
		int val = 0;
		
		for(int a = 0; a< arr.length ; a++)
		{
			for(int b = a+1; b<arr.length; b++)  
			{
				if(arr[a]== arr[b])
				{
					if(val != arr[b]) {
					System.out.println("Duplicate Value is "+ arr[b]);	
					 }
					 val = arr[b];
				}
			}
		}

	}

}
