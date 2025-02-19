package org.example;


import java.util.Scanner;

public class App {
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        menu();

    }

    public static void menu() {
        System.out.println("Please pick a choice:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 5) {
            System.exit(0);
        }
        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        switch (choice) {
            case 1:
                add(firstNumber,secondNumber );
                break;
            case 2:
                subtract(firstNumber,secondNumber);
                break;
            case 3:
               multiply(firstNumber,secondNumber);
                break;
            case 4:
                divide(firstNumber,secondNumber);
                break;
        }
        menu();
    }

    public static int add(int first, int second) {
        System.out.println("The sum of " + first + " and " + second + " is " + (first + second));
        return first + second;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber));
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
        System.out.println("The quotient of " + firstNumber + " and " + secondNumber + " is " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }

}
