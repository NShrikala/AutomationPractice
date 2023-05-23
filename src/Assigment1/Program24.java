package Assigment1;

public class Program24 {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,33,63,97};		
		System.out.println("Even Number of Array are :-  ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print("  " + arr[i]);
			}
		}		
		System.out.println("\n Odd Number if Array are :- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.print("  " + arr[i]);
			}
		}		
	}

}
