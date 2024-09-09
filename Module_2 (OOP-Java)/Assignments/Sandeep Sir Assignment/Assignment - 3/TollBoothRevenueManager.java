//5-Toll
import java.util.Scanner;

public class TollBoothRevenueManager {
    double carRate, truckRate, motorcycleRate;
    int carCount, truckCount, motorcycleCount;

    public void setTollRates() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter toll rate for Cars: ");
        carRate = sc.nextDouble();
        System.out.print("Enter toll rate for Trucks: ");
        truckRate = sc.nextDouble();
        System.out.print("Enter toll rate for Motorcycles: ");
        motorcycleRate = sc.nextDouble();
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Cars: ");
        carCount = sc.nextInt();
        System.out.print("Enter number of Trucks: ");
        truckCount = sc.nextInt();
        System.out.print("Enter number of Motorcycles: ");
        motorcycleCount = sc.nextInt();
    }

    public double calculateRevenue() {
        return (carCount * carRate) + (truckCount * truckRate) + (motorcycleCount * motorcycleRate);
    }

    public void printRecord() {
        double totalRevenue = calculateRevenue();
        int totalVehicles = carCount + truckCount + motorcycleCount;
        System.out.println("Total number of vehicles: " +totalVehicles);
        System.out.printf("Total revenue collected: "+totalRevenue);
    }

    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();
        manager.setTollRates();
        manager.acceptRecord();
        manager.printRecord();
    }
}
