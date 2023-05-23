package Assigment1;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,0,30,40,50,60,510,80,90,300};
		int min = arr[0];
		
		for(int a = 0; a<arr.length; a++)
		{
			if(arr[a]<min)    
			{
				min = arr[a]; 
			}
		}
		System.out.println("Smallest Number in array is : "+min);
	}

}
