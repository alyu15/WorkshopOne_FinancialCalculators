package com.ps;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Please select which calculator you would like to use:");
        System.out.println("Mortgage, Compound Interest, or Present Value");
            String calculator = scanner.nextLine();

            if (calculator.equals("Mortgage")) {
                mortgageCalculator(scanner);
            }
            else if (calculator.equals("Compound Interest")) {
                compoundCalculator(scanner);
            }
            else if (calculator.equals("Present Value")) {
                pvCalculator(scanner);
            }
            else {
                System.out.printf("%s is not recognized. Please enter in one of the given options.",
                calculator
                );
            }
    }
/* Mortgage Calculator */

    public static void mortgageCalculator(Scanner scanner) {

        System.out.println("Please enter the principal amount.");
            int principal = scanner.nextInt();

        System.out.println("Please enter the interest rate.");
            double percentage = scanner.nextDouble();
                double interestRate = percentage/100;
                double mInterest = interestRate / 12;

        System.out.println("Please enter in the loan length in years.");
            float loanLength = scanner.nextFloat();
            float numPayments = loanLength * 12;

/* Monthly mortgage payment = Principal*((minterest*(1+minterest)^(numpayments))/(1+mrate)^(numpayments)-1*/

        double expression = Math.pow(1+mInterest,numPayments);
        double mPayment1 = principal*mInterest*expression;
        double mPayment2 = Math.pow(1+mInterest,numPayments)-1;
        double monthlyPayment = mPayment1/mPayment2;

        System.out.printf("Your expected monthly payment is $%.2f%n",
                monthlyPayment
        );

        /* Total interest payment */

        double cInterest = monthlyPayment*numPayments-principal;

        System.out.printf("Your total interest is $%.2f%n",
                cInterest
        );

    }

    public static void compoundCalculator(Scanner scanner) {

    }

    public static void pvCalculator(Scanner scanner) {

    }

}