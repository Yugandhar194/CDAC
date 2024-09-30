import java.util.Arrays;
	class Q2{
	public static void isDuplicate(int arr[]){
		
		boolean flag = true;	//default value
		Arrays.sort(arr);	
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] == arr[i+1]){			
				System.out.print(arr[i]+" ");
				flag = false;	//set and update value from false to true
			}
		}
		
		if(flag == true)
			System.out.print("-1");		//means arr is empty
	}

	public static void main(String args[]){		
		int n = 5;
		int arr [] = {1,1,2};
		isDuplicate(arr);
	}
}