package bank;

import java.util.Scanner;
public class Customer {
    String name;
    int accNo;
    int balance;

    public Customer(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
        this.balance = 0;
    }

    public void creditTransaction(int amount) {
        Scanner input = new Scanner(System.in);
        try {
            if (amount < 0) {
                throw new InvalidCredit();
            } else {
                balance += amount;
                System.out.println("Successfully credited: " + amount);
            }
        } catch (InvalidCredit e) {
            System.out.print(e.getMessage() + " Enter a valid amount: ");
            amount = input.nextInt();
            creditTransaction(amount);
        }
    }

    public void debitTransaction(int amount) {
        Scanner input = new Scanner(System.in);
        try {
            if (amount > balance) {
                throw new InvalidDebit();
            } else {
                balance -= amount;
                System.out.println("Successfully debited: " + amount);
            }
        } catch (InvalidDebit e) {
            System.out.print(e.getMessage() + " Enter a valid amount: ");
            amount = input.nextInt();
            debitTransaction(amount);
        }
    }

    public void displayDetails() {
        System.out.println("Customer Details");
        System.out.println("****************");
        System.out.println("Customer Name : " + this.name);
        System.out.println("Customer AccNo : " + this.accNo);
        System.out.println("Customer Current Balance : " + this.balance);
    }
}

