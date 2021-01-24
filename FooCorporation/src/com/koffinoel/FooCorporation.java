package com.koffinoel;

public class FooCorporation {

    public static void main(String[] args) {

        System.out.println("Employee 1");
        printTotalPay(7.50,35);

        System.out.println("\nEmployee 2");
        printTotalPay(8.20,47);

        System.out.println("\nEmployee 3");
        printTotalPay(10.00,73);

    }

    public static void printTotalPay (double basePay, double hoursWorked){
        
        double minBasePay = 8;
        double legalHourWorked = 40;
        double maxHourWorked = 60;

        if (basePay >= minBasePay) {
            if ((hoursWorked > 0) && (hoursWorked <= maxHourWorked)) {
                double totalPay;
                if (hoursWorked <= legalHourWorked) {
                    totalPay = hoursWorked * basePay;
                    System.out.println("Total_pay = " + totalPay);

                } else if (hoursWorked > legalHourWorked) {
                    double overtime = hoursWorked - legalHourWorked;
                    totalPay = ((legalHourWorked * basePay) + (basePay * 1.5 * overtime));
                    System.out.println("This employee has $" + basePay + " for base pay\nAnd he  worked for " + hoursWorked + " hours\nThen his TOTAL PAY = $"  + totalPay);
                }

            }else {
                System.out.println("Invalid hours worked");
            }
        }else {
            System.out.println("Invalid base pay");

        }


    }

}
