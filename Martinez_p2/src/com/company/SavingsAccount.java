package com.company;

public class SavingsAccount {


        public static double calculateMonthlyInterest(double balance, double annualInterestRate) {
            double newBalance = (balance * annualInterestRate) / 12;
            newBalance = balance + newBalance;
            return newBalance;
        }
}
