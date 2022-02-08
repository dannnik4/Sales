package utils;

public class Rounder {

    public static double rounder(double value){
        return Math.ceil(value * 100) / 100;
    }

}