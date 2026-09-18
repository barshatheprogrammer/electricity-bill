package com.electricity;

import java.util.Scanner;

public class App {

    public static double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException("Units cannot be negative");
        }

        double bill;

        if (units <= 100) {
            bill = units * 2.50;
        } 
        else if (units <= 200) {
            bill = (100 * 2.50) + ((units - 100) * 4.00);
        } 
        else if (units <= 500) {
            bill = (100 * 2.50)
                    + (100 * 4.00)
                    + ((units - 200) * 5.50);
        } 
        else {
            bill = (100 * 2.50)
                    + (100 * 4.00)
                    + (300 * 5.50)
                    + ((units - 500) * 7.00);
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = scanner.nextInt();

        double bill = calculateBill(units);

        System.out.println("Units Consumed: " + units);
        System.out.printf("Electricity Bill: Rs. %.2f%n", bill);

        scanner.close();
    }
}