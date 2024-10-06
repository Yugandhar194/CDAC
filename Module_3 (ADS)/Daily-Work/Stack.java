// Array Implementation of Stack

class Stack {

	static final int MAX =10;     // Finalizing array size / stack size
	int top;
	int a[] = new int [MAX];
	
	Stack () {
		top = -1;
	}
	
	boolean isEmpty () {
		return(top < 0);
	}
	
	
	// Insertion : using push () Operation -
	boolean push (int x) {
		if (top >= (MAX-1)) {
			System.out.println ("Stack Overflow");
			return false;
		}
		a [++top] = x;
		return true;
	}
	
	// Deletion : using pop () Operation -> Here we only Lower the top (We don't deal with the number).
	int pop () {
		if (top < 0) {
		System.out.println ("Stack Undererflow");      // check for stack is not underflow
		return 0;
		}
		/*
		int num = a [top--];
		return num;
		*/
		return a[top--];
	}

	//int peek () Operation
	
	int peek () {
		/*
		if (top < 0)
			return 0;
		else
			return a [top];
		*/
		return (top < 0) ? 0 : a[top];
	}


	void display () {
		if  (isEmpty ()) {
			System.out.println ("Stack is Empty");  
		}
		else 
			System.out.println ("Stack Elements are : ");
			show(top);
			System.out.println ();  
	}
	
	void show (int index) {
		if  (index < 0)       // base condition
			return;
		System.out.println (a [index] + " ");
			show (index-1);      // recursive call
	}

	public static void main (String [] args) {
		Stack s1 = new Stack ();
		s1.push (10);
		s1.push (20);
		s1.push (30);
		
		s1.display ();
		
		s1.pop ();
		s1.display ();

}



}