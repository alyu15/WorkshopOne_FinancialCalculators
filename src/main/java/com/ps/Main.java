package com.ps;

import java.util.*;

public class Main {

    /* Calculator 1: Mortgage Calculator */

    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

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

        System.out.println(String.format("Your expected monthly payment is $%.2f",
                monthlyPayment
        ));

        /* Total interest payment */

        double cInterest = monthlyPayment*numPayments-principal;

        System.out.println(String.format("Your total interest is $%.2f",
                cInterest
        ));

    }
}