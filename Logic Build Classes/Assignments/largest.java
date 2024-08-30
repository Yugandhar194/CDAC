import java.util.*;
	class largest {
    public static void main (String args[]) {
        System.out.println("Enter the three numbers");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c) 
        System.out.println(+a+" is the greatest among the three");
        else if (b>a && b>c) {
            System.out.println(+b+" is the greatest among the three");
        } 
        else  {
            System.out.println(+c+" is the greatest among the three");
        }
    }
}
