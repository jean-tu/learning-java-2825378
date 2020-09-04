import java.util.Scanner;

public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxrate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxrate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(30, .2, .08 );
    }

}
