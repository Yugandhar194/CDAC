//Insertion Sort
class Isorting{
	
	static void isort(int[] arr){
		int n = arr.length;
		//taking i as 1 becuase first element to be sorted
		for(int i = 1; i < n; i++)
		{
			int key = arr[i];  //value 
			int j = i - 1;		//index
			while(j >= 0 && arr[j] > key) //if j is bigger than the first element and the key
			{
				arr[j+1] = arr[j];  //jabtak 
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}
	
	static void display(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {3,2,44,1,22,43,24,7};
		display(arr);
		isort(arr);
		display(arr);
	}
}