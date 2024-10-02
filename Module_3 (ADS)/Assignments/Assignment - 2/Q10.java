import java.util.Arrays;
class Q10 //Rotate Array
{
	static void rotateArr(int [] arr, int d){
		int n = arr.length;
		for(int i=0;i<d;i++){				
			int first = arr[0];				
			for(int j=0;j<n-1;j++){
				arr[j] = arr[j+1];
			}
			arr[n-1] = first;
		}	
	}
	
	public static void main(String args[]){
	
		int [] arr1 = {1, 2, 3, 4, 5};
		int	 d1 = 2;
		rotateArr(arr1,d1);
		for(int ele : arr1)
		System.out.print(ele+" ");
		System.err.println();	
		int [] arr2 = {10,20,30,40};
		int d2 = 1;
		rotateArr(arr2,d2);
		for(int ele : arr2)
			System.out.print(ele+" ");	
	}
}

//TC= O(n*d)
//SC=O(1)