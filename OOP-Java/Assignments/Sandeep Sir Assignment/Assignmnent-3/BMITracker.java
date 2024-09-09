//3-BMI
import java.util.Scanner;

public class BMITracker {
    double weight, height;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        weight = scanner.nextDouble();
        System.out.print("Enter height (in meters): ");
        height = scanner.nextDouble();
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String classifyBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public void printRecord() {
        double bmi = calculateBMI();
        String classification = classifyBMI();
        System.out.printf("BMI: "+bmi);
        System.out.println("Classification: " + classification);
    }

    public static void main(String[] args) {
        BMITracker tracker = new BMITracker();
        tracker.acceptRecord();
        tracker.printRecord();
    }
}
