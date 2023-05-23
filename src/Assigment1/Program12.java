package Assigment1;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		
		int sum = 0;
		
		for(int a = 0; a<arr.length;a++)
		{
			sum += arr[a];
			// sum = sum+arr[a];
		}
		System.out.println("Sum of elements = "+ sum);

	}

}
