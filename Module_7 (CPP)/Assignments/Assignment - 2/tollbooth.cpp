#include <iostream>
using namespace std;

class TollBooth {
private:
    int totalVehicles;
    double totalRevenue;

public:
    TollBooth() : totalVehicles(0), totalRevenue(0.0) {}

    void reset() {
        totalVehicles = 0;
        totalRevenue = 0.0;
        cout << "Booth statistics reset \n";
    }

    void vehiclePayingToll(int vehicleType) {
        double tollAmount = 0;

        if (vehicleType == 1) tollAmount = 20;  // Standard car
        else if (vehicleType == 2) tollAmount = 50;  // Truck
        else if (vehicleType == 3) tollAmount = 100;  // Bus

        totalVehicles++;
        totalRevenue += tollAmount;
        cout << "Toll collected: Rs " << tollAmount << endl;
    }

    int getTotalVehicles() { return totalVehicles; }
    double getTotalRevenue() { return totalRevenue; }
};

int main() {
    TollBooth booth;
    int choice;

    while (true) {
        cout << "\nMenu:\n1. Add Standard Car\n2. Add Truck\n3. Add Bus\n4. Display Total Cars Passed\n5. Display Total Revenue\n6. Reset Booth Statistics\n7. Exit\nEnter choice: ";
        cin >> choice;

        if (choice == 1) {
            booth.vehiclePayingToll(1);
        } else if (choice == 2) {
            booth.vehiclePayingToll(2);
        } else if (choice == 3) {
            booth.vehiclePayingToll(3);
        } else if (choice == 4) {
            cout << "Total Vehicles: " << booth.getTotalVehicles() << endl;
        } else if (choice == 5) {
            cout << "Total Revenue: Rs " << booth.getTotalRevenue() << endl;
        } else if (choice == 6) {
            booth.reset();
        } else if (choice == 7) {
            break;
        } else {
            cout << "Invalid choice!\n";
        }
    }

    return 0;
}
