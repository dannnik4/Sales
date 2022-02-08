package models;


import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    private final double TAX_RATE = 0.05;

    @Override
    public double calculateIncome(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double calculateIncome(double income, double taxFromIncome) {
        return income - taxFromIncome;
    }

    @Override
    public double taxFromIncome(double income) {
        return income * TAX_RATE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}