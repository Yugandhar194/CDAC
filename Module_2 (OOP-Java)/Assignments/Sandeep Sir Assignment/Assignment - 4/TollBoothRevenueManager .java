import java.util.Scanner;
class TollBoothRevenueManager  {

    // Fields for storing toll rates and vehicle counts
    private double carTollRate;
    private double truckTollRate;
    private double motorcycleTollRate;

    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    // Getter and Setter methods for carTollRate
    public double getCarTollRate() {
        return carTollRate;
    }

    public void setCarTollRate(double carTollRate) {
        this.carTollRate = carTollRate;
    }

    // Getter and Setter methods for truckTollRate
    public double getTruckTollRate() {
        return truckTollRate;
    }

    public void setTruckTollRate(double truckTollRate) {
        this.truckTollRate = truckTollRate;
    }

    // Getter and Setter methods for motorcycleTollRate
    public double getMotorcycleTollRate() {
        return motorcycleTollRate;
    }

    public void setMotorcycleTollRate(double motorcycleTollRate) {
        this.motorcycleTollRate = motorcycleTollRate;
    }

    // Getter and Setter methods for carCount
    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    // Getter and Setter methods for truckCount
    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    // Getter and Setter methods for motorcycleCount
    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    // Method to accept toll rates and vehicle counts from the user
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        // Accept toll rates for different vehicle types
        System.out.print("Enter the toll rate for Cars: ");
        setCarTollRate(scanner.nextDouble());

        System.out.print("Enter the toll rate for Trucks: ");
        setTruckTollRate(scanner.nextDouble());

        System.out.print("Enter the toll rate for Motorcycles: ");
        setMotorcycleTollRate(scanner.nextDouble());

        // Accept vehicle counts for each type
        System.out.print("Enter the number of Cars passed: ");
        setCarCount(scanner.nextInt());

        System.out.print("Enter the number of Trucks passed: ");
        setTruckCount(scanner.nextInt());

        System.out.print("Enter the number of Motorcycles passed: ");
        setMotorcycleCount(scanner.nextInt());

        scanner.close();
    }

    // Method to calculate the total revenue
    public double calculateTotalRevenue() {
        double carRevenue = getCarTollRate() * getCarCount();
        double truckRevenue = getTruckTollRate() * getTruckCount();
        double motorcycleRevenue = getMotorcycleTollRate() * getMotorcycleCount();

        return carRevenue + truckRevenue + motorcycleRevenue;
    }

    // Method to calculate the total number of vehicles
    public int calculateTotalVehicles() {
        return getCarCount() + getTruckCount() + getMotorcycleCount();
    }

    // Method to print the total number of vehicles and revenue
    public void printRecord() {
        int totalVehicles = calculateTotalVehicles();
        double totalRevenue = calculateTotalRevenue();

        System.out.println("Total Vehicles Passed: " + totalVehicles);
        System.out.printf("Total Revenue Collected: "+ totalRevenue);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        TollBoothRevenueManager  tbr = new TollBoothRevenueManager ();

        // Accept user input for toll rates and vehicle counts
        tbr.acceptRecord();

        // Display the total number of vehicles and total revenue collected
        tbr.printRecord();
    }
}
