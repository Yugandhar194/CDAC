class Stack{
	static final int size = 10;
	int top = -1;
	int arr [] = new int [size];
	boolean isEmpty(){
		if(top==-1){
			return true;
		}
		return false;
	}
	boolean isFull(){
		if(top == size-1) {
		return true;
		}
		else {
		return false;
	}
	}
	void push(int x){
		if(isFull()){
			System.out.println("Stack is full");
		}
		else{
			if(isEmpty() || x <= peek()){
			arr[++top] = x;
			}
		}
		
	}
	
	int peek(){
		if(isEmpty())
			return -1;
		else
			return arr[top];
	}
	
	int getMin(){
		return arr[top];
	}
	public static void main(String args[]){
		
		Stack st = new Stack();
		
		System.out.println("Test case 1 :  ");
		st.push(5);
		st.push(3);
		st.push(7);
		
		System.out.println("Min = "+st.getMin());
		
		Stack st1 = new Stack();
		
		System.out.println("Test case 2 :  ");
		st1.push(10);
		st1.push(8);
		st1.push(6);
		st1.push(12);
		
		System.out.println("Min = "+st1.getMin());	
	}
}
//Time Complexity: O(1)
//Space Complexity: O(1)