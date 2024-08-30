import java.util.*;
class Grade {
	public static void main(String args[]) {
	int marks;
	Scanner sc = new Scanner(System.in);
	marks = sc.nextInt();
	if (marks>=90) {
		System.out.println("You got A grade!");
	}
	else if(marks>=80 && marks <=89) {
		System.out.println("You got B grade!");
	}
	else if(marks>=70 && marks <=79) {
		System.out.println("You got C grade!");
	}
	else if(marks>=60 && marks <=69) {
		System.out.println("You got D grade!");
	}	
	else{
			System.out.println("You got F grade!");
	}
}
}