import java.util.Scanner;
class TollBoothRevenueManager  {

    //Member fields
    private double carTollRate;
    private double truckTollRate;
    private double motorcycleTollRate;

    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    // Getter and Setter methods
    public double getCarTollRate() {
        return carTollRate;
    }

    public void setCarTollRate(double carTollRate) {
        this.carTollRate = carTollRate;
    }
    public double getTruckTollRate() {
        return truckTollRate;
    }

    public void setTruckTollRate(double truckTollRate) {
        this.truckTollRate = truckTollRate;
    }

    public double getMotorcycleTollRate() {
        return motorcycleTollRate;
    }

    public void setMotorcycleTollRate(double motorcycleTollRate) {
        this.motorcycleTollRate = motorcycleTollRate;
    }
    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    // Method to accept toll rates
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Cars: ");
        setCarTollRate(scanner.nextDouble());

        System.out.print("Enter the toll rate for Trucks: ");
        setTruckTollRate(scanner.nextDouble());

        System.out.print("Enter the toll rate for Motorcycles: ");
        setMotorcycleTollRate(scanner.nextDouble());

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


    public int calculateTotalVehicles() {
        return getCarCount() + getTruckCount() + getMotorcycleCount();
    }

    public void printRecord() {
        int totalVehicles = calculateTotalVehicles();
        double totalRevenue = calculateTotalRevenue();

        System.out.println("Total Vehicles Passed: " + totalVehicles);
        System.out.printf("Total Revenue Collected: "+ totalRevenue);
    }

    // Main method
    public static void main(String[] args) {
        TollBoothRevenueManager  tbr = new TollBoothRevenueManager ();
        tbr.acceptRecord();
        tbr.printRecord();
    }
}
