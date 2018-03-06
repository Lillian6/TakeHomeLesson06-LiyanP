package com.example.pengbuding.tipcalculator;

import java.io.Serializable;

/**
 * Created by pengbuding on 06/03/2018.
 */

public class Receipt implements Serializable {
    private double amount;
    private double taxPercentage;
    private double tipPercentage;
    private double totalPrice = amount + amount * taxPercentage + amount * tipPercentage;

    public Receipt(){
    }

    public Receipt(double amount, double taxPercentage, double tipPercentage, double totalPrice){
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
        this.totalPrice = totalPrice;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getAmount() {
        return amount;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Total: " + amount +
                "\nSales Tax: " + taxPercentage * 100 +
                "\nTip: " + tipPercentage * 100 +
                "\nGrand Total: " + totalPrice;
    }
}
