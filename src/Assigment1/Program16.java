package Assigment1;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,30,20,50,40};
		int temp = 0;
		
		for(int i = 0; i <arr.length; i++)
		{
			for(int j = i+1;  j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
//		System.out.println("\nValues in Descending Orders : ");
//		
//		for(int a : arr)
//		{
//			System.out.print(" "+ a);
//		}
//		
		
			System.out.println("\n\n3rd Largest Number is : " + arr[2]);
		
		
	}

}
