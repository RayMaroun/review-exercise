package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        int age = getAge(scanner);
        printNameAndAge(name, age);
        printVotingEligibility(age);
        printMessage(name, age);

        printWelcomeMessage(name);
        printDrinkingEligibility(name, age);

        double numberFromUser = getNumber(scanner);

        double squareRootNumber = calculateSquareRoot(numberFromUser);
        System.out.println("The square root of " + numberFromUser + " is " + squareRootNumber);


        compareTwoNumbers(scanner);

        String welcomeMessage = name.equals("Eve") ? "You are not welcome" : "Welcome home";
        System.out.println(welcomeMessage);


  /*      if (name.equals("Eve")) {
            welcomeMessage = "You are not welcome";
        } else {
            welcomeMessage = "Welcome home";
        }
        System.out.println(welcomeMessage);*/

        double number1 = 5.6;
        double number2 = 3.2;

        double maxNumber = getMax(number1, number2);
        System.out.println("The maximum of the two numbers is: " + maxNumber);


        double num1 = 3.2;
        double num2 = 2.1;

        double minNumber = getMin(num1, num2);
        System.out.println("The minimum of the two numbers is: " + minNumber);


    }

    public static double getMin(double num1, double num2) {
        double result = Math.min(num1, num2);
        return result;
    }

    public static double getMax(double num1, double num2) {
        double result = Math.max(num1, num2);
        return result;
    }

    public static void compareTwoNumbers(Scanner scanner) {
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        if (isGreaterThan(firstNumber, secondNumber)) {
            System.out.println("The first number is greater than the second");
        } else {
            System.out.println("The first number is not greater than the second");
        }
    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber) {
        boolean isGreaterThan = firstNumber > secondNumber;
        return isGreaterThan;
    }

    public static double calculateSquareRoot(double number) {
        double squareRoot = Math.sqrt(number);
        return squareRoot;
    }

    public static double getNumber(Scanner scanner) {
        System.out.println("Enter a number: ");
        double numberFromUser = scanner.nextDouble();
        return numberFromUser;
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You are old enough to drink.");
        } else {
            System.out.println("You are not old enough to drink.");
        }
    }

    public static void printWelcomeMessage(String name) {
/*        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome Alice!");
        } else {
            System.out.println("Hello Stranger");
        }*/

        switch (name.toLowerCase()) {
            case "alice":
                System.out.println("Welcome Alice!");
                break;
            case "bob":
                System.out.println("Hey Bob, do you want to grab a drink?");
                break;
            default:
                System.out.println("Hello Stranger");
                break;
        }
    }

    public static void printVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("You are not old enough to vote");
        }
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();
        return age;
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old!");
    }

}
