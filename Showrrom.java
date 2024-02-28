package lab6;

import java.util.Scanner;

class ShowRoom {
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

    ShowRoom() {
        name = "";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        mobno = scanner.nextLong();
        System.out.print("Enter cost of items purchased: ");
        cost = scanner.nextDouble();
    }

    void calculate() {
        if (cost <= 10000) {
            dis = cost * 0.05;
        } else if (cost <= 20000) {
            dis = cost * 0.10;
        } else if (cost <= 35000) {
            dis = cost * 0.15;
        } else {
            dis = cost * 0.20;
        }

        amount = cost - dis;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Mobile Number: " + mobno);
        System.out.println("Amount to be paid after discount: " + amount);
    }

    public static void main(String[] args) {
        ShowRoom customer = new ShowRoom();
        customer.input();
        customer.calculate();
        customer.display();
    }
}
