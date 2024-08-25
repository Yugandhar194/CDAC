import java.util.*;
class Result {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int subject1, subject2, subject3;
        int failCount = 0;

        System.out.println("Enter the marks for Subject 1: ");
        subject1 = sc.nextInt();
        System.out.println("Enter the marks for Subject 2: ");
        subject2 = sc.nextInt();
        System.out.println("Enter the marks for Subject 3: ");
        subject3 = sc.nextInt();

        if (subject1 <= 40) {
            failCount++;
        }
        if (subject2 <= 40) {
            failCount++;
        }
        if (subject3 <= 40) {
            failCount++;
        }

        if (failCount == 0) {
            System.out.println("The student has passed in all subjects.");
        }
        else 
        {
            System.out.println("The student has failed in " + failCount + " subjects.");
        }
    }
}
