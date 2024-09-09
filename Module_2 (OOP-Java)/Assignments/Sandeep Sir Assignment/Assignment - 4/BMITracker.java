import java.util.*;
class BMITracker {
    //instance
    private double weight;
    private double height;
    
    //get-set for W
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //get-set for H
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //print and accept
    public void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter weight in kg: ");
        setWeight(sc.nextDouble());
        
        System.out.println("Enter height in cms: ");
        setHeight(sc.nextDouble());
        
        sc.close();
    }
    //calculate BMI
    public double calculateBMI() {
        double bmi = getWeight() / (getHeight() * getHeight());
        return bmi;
    }
    // Method to classify BMI
    public String classifyBMI() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    // Method to display the BMI and classification
    public void printRecord() {
        double bmi = calculateBMI();
        String classification = classifyBMI();

        System.out.printf("Your BMI is: "+bmi);
        System.out.println("BMI Classification: " + classification);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        BMITracker bmiTracker = new BMITracker();
        // Accept user input
        bmiTracker.acceptRecord(); //method called to accept input
        // Display BMI and classification
        bmiTracker.printRecord();   //method for outpt
    }
}