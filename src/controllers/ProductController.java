package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController {

    Product model;
    SalesView view;


    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();
        double income = Rounder.rounder(model.calculateIncome(model.getQuantity(), model.getPrice()));
        double taxFromIncome = Rounder.rounder(model.taxFromIncome(income));
        double pureIncome = Rounder.rounder(model.calculateIncome(income, taxFromIncome));

        String output =  "\tНаименование товара: " + name
                + "\nОбщий доход (грн.): " + income
                + "\nСумма налога (грн.): " + taxFromIncome
                + "\nЧистый доход (грн.): " + pureIncome;

        view.getOutput(output);
    }
}