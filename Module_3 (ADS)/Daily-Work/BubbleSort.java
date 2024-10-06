import java.util.*;
class BubbleSort {
    static int arr[]=new int[5];
    public static  void bubbleSort(){
        int temp=0;
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr.length-1-i;++j){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i = 0;i<arr.length;++i){
            arr[i]=sc.nextInt();
        }
        bubbleSort();
        for(int element:arr){
            System.out.println(element);
        }
        sc.close();
    }
}