public class Main {
    // it's not void, but double in this case b/c we're returning a double from this function
    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, 0.08);
        System.out.println(groupTotalMealPrice);

        double individalMealprice = groupTotalMealPrice/5;
        System.out.println(individalMealprice);
    }

}
