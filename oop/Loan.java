package javase.oop;

import java.util.Date;

import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        super();
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getMonthlyInterestRate(double annualInterestRate) {
        return annualInterestRate / 12;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterest = getMonthlyInterestRate(annualInterestRate);

        double denominator = 1 - (1 / ( Math.pow(1 + monthlyInterest, numberOfYears * 12)));

        double monthlyPayment = loanAmount * monthlyInterest / denominator;

        return Math.round(monthlyPayment);
    }

    public double getTotalPayment() {

        return getMonthlyPayment() * numberOfYears * 12;
    }
}
