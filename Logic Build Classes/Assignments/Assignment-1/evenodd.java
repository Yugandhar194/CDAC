import java.util.Scanner;

public class evenodd {
    public static void main (String args[]) {
        int i;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        i=sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("Even");
        }
        else if(i % 2 != 0)  {
            System.out.println("Odd");
        }
		else {
			System.out.println("Zero");
		}
    }
}
