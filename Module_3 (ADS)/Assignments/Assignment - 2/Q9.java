import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
		System.out.println("Enter any string to check Palindrome");
		Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();	//reverse method
	  //method to compare str and str1
	
        if (str.equals(str1.toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
