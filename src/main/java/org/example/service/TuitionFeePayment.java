package org.example.service;

public class TuitionFeePayment {
    private double totalFee = 16200;
    private double amountPaid = 0;

    public TuitionFeePayment() {
    }

    public double calculateTuition(int units) {
        return totalFee;
    }

    public void makePayment(double amount) {
        amountPaid += amount;
    }

    public double getBalance() {
        return totalFee - amountPaid;
    }

    public boolean isFullyPaid() {
        return amountPaid >= totalFee;
    }
}