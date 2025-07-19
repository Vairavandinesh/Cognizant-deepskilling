package com.example.loan_service.model;

public class Loan {
    private String loanNumber;
    private double amount;
    private double interestRate;

    public Loan(String loanNumber, double amount, double interestRate) {
        this.loanNumber = loanNumber;
        this.amount = amount;
        this.interestRate = interestRate;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
