import java.util.Scanner;
import java.util.Arrays;

public class Q5 //ArrayReversor 
{
		public static void reverseArray(int[] arr)
	{
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}	
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] arr= new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		reverseArray(arr);
	}
}