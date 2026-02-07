package org.example;

import java.util.Scanner;

public class SwitchMonthsAndQuarters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");
        int monthNumber = scanner.nextInt();



        switch (monthNumber) {
            case 1 -> System.out.println("January is in Q1");
            case 2 -> System.out.println("February is in Q1");
            case 3 -> System.out.println("March is in Q1");
            case 4 -> System.out.println("April is in Q2");
            case 5 -> System.out.println("May is in Q2");
            case 6 -> System.out.println("June is in Q2");
            case 7 -> System.out.println("July is in Q3");
            case 8 -> System.out.println("August is in Q3");
            case 9 -> System.out.println("September is in Q3");
            case 10 -> System.out.println("October is in Q4");
            case 11 -> System.out.println("November is in Q4");
            case 12 -> System.out.println("December is in Q4");
            default -> System.out.println("Invalid month number. Please enter a number between 1 and 12");
        }


        scanner.close();





    }
}
