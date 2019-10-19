package com.company;

public class Main {
    private static double annualInterestRate;

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

	    annualInterestRate = 0.04;
        double saver1Bal = 2000.00;
        double saver2Bal = 3000.00;

        saver1Bal = saver1.calculateMonthlyInterest(saver1Bal, annualInterestRate);
        saver2Bal = saver2.calculateMonthlyInterest(saver2Bal, annualInterestRate);

        System.out.printf("Saver 1 balance is %.2f and Saver 2 balance is %.2f\n", saver1Bal, saver2Bal);

        modifyInterestRate(annualInterestRate);

        saver1Bal = saver1.calculateMonthlyInterest(saver1Bal, annualInterestRate);
        saver2Bal = saver2.calculateMonthlyInterest(saver2Bal, annualInterestRate);

        System.out.printf("After setting interest rate to 5 percent, Saver 1 balance is %.2f and Saver 2 balance is %.2f\n", saver1Bal, saver2Bal);
    }

    public static double modifyInterestRate(double annualInterestRate) {
        annualInterestRate = 0.05;
        return annualInterestRate;

    }
}

