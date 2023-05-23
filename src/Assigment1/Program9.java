package Assigment1;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,510,80,90,300};
		int max = arr[0];
		
			for(int a = 0 ; a< arr.length; a++)
			{
				
					if(arr[a]>max)  //arr[7]  90 > max
					{
						max = arr[a]; // max = 510;
					}
				
			}
			System.out.println("Largest Number in array is : "+max);

	}

}
