#include <iostream>
#include <string>
using namespace std;

class BankAccount {
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    void setAccountDetails(int accNum, string name, double bal) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        cout << "Deposited: " << amount << ". New Balance: " << balance << endl;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            cout << "Withdrawn: " << amount << ". Remaining Balance: " << balance << endl;
        } else {
            cout << "Insufficient balance!\n";
        }
    }

    void displayAccountDetails() {
        cout << "Account Number: " << accountNumber
             << ", Account Holder: " << accountHolderName
             << ", Balance: " << balance << endl;
    }
};

int main() {
    BankAccount account;
    int choice;

    account.setAccountDetails(1945, "Yugandhar Deshmukh", 0);

    while (true) {
        cout << "\nMenu:\n1. Deposit Money\n2. Withdraw Money\n3. Display Account Details\n4. Exit\nEnter choice: ";
        cin >> choice;

        if (choice == 1) {
            double amount;
            cout << "Enter amount to deposit: ";
            cin >> amount;
            account.deposit(amount);
        } else if (choice == 2) {
            double amount;
            cout << "Enter amount to withdraw: ";
            cin >> amount;
            account.withdraw(amount);
        } else if (choice == 3) {
            account.displayAccountDetails();
        } else if (choice == 4) {
            break;
        } else {
            cout << "Invalid choice!\n";
        }
    }

    return 0;
}
