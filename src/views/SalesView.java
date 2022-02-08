package views;

import models.Product;
import utils.Validator;
import java.util.Scanner;

public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Product model;

    public SalesView(Product model){
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);
        title = "Введите наименование товара: ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество: ";
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {

        System.out.println(output);
    }
}