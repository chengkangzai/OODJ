/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T09092020;

import java.util.Scanner;

/**
 *
 * @author CCK
 */
public class Main {

    static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        q10();
    }

    public static void q1() {
        System.out.println("Type a Fahrenheit: ");
        int f = scan.nextInt();
        System.out.println("Getting i for: " + f);
        double cel = (f - 32) / (9 / 5);
        System.out.printf("Celsius for " + f + " is :" + cel);
    }

    public static void q2() {
        System.out.println("Please enter the value of radius");
        double radius = scan.nextDouble();
        System.out.println("Please enter the value of length");
        double length = scan.nextDouble();
        double area = radius * length * Math.PI;
        double vol = area * length;
        System.out.printf("Area is -> " + "%.2f\n", area);
        System.out.printf("Volume is -> " + "%.2f\n", vol);
    }

    public static void q3() {
        boolean notValidate = true;
        int input = 0;
        int sum = 0;
        while (notValidate) {
            System.out.println("Enter any number between 0-1000");
            input = scan.nextInt();
            if (input <= -1 || input >= 1000) {
                System.out.println("Not Valid");
            } else {
                notValidate = true;
            }
        }
        String splited[] = String.valueOf(input).split("");
        for (int i = 0; i < splited.length; i++) {
            sum += Integer.valueOf(splited[i]);
        }
        System.out.println(sum);
    }

    public static void q7() {
        boolean notValidate = true;
        int input = 0;
        while (notValidate) {
            System.out.println("Enter your marks");
            input = scan.nextInt();
            if (input < 0 || input >= 101) {
                System.out.println("Invalid Input!");
            } else {
                notValidate = false;
            }
        }
        String grade = "";
        String description = "";
        if (input <= 40) {
            grade = "F";
            description = "Fail";
        } else if (input <= 49) {
            grade = "F+";
            description = "Marginal Fail";
        } else if (input <= 54) {
            grade = "D";
            description = "Pass";
        } else if (input <= 64) {
            grade = "C";
            description = "Pass";
        } else if (input <= 69) {
            grade = "B";
            description = "Credit";
        } else if (input <= 74) {
            grade = "B+";
            description = "Credit";
        } else if (input <= 79) {
            grade = "A";
            description = "Distinction";
        } else if (input <= 100) {
            grade = "A+";
            description = "Distinction";
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Your grade is " + grade + " which is " + description);
    }

    public static void q10() {
        int choice = 0;
        Scanner SC = new Scanner(System.in);
        do {
            System.out.println("Menu of Choices");
            System.out.println("---------------------");
            System.out.println("1. Order Food Items");
            System.out.println("2. Edit Order");
            System.out.println("3. Cancel Order");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");
            choice = SC.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Order Coding");
                    break;
                case 2:
                    System.out.println("Edit Coding");
                    break;
                case 3:
                    System.out.println("Cancel Order");
                    break;
                case 4:
                    System.out.println("Make Paymment");
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

            }
        } while (choice != 5);
    }

}
