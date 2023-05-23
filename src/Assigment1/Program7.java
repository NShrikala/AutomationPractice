package Assigment1;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Elements placed in even number position are ");
		for(int a = 0; a< arr.length; a++)
		{
			if(a % 2 == 0)
			{
				System.out.println(arr[a]);
			}
		}
		
	}

}
