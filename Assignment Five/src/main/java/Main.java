import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Order order = new Order();
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.10);

        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        FoodItem burger = new BasicFoodItem("Burger", 6.99);
        FoodItem hotdog = new BasicFoodItem("Hotdog", 4.99);

        FoodItem friesWithKetchup = new KetchupTopping(fries);
        FoodItem burgerWithCheeseAndBacon = new BaconTopping(new CheeseTopping(burger));
        FoodItem hotdogWithBacon = new BaconTopping(hotdog);

        order.addItem(friesWithKetchup);
        order.addItem(burgerWithCheeseAndBacon);
        order.addItem(hotdogWithBacon);

        System.out.println(fries + ": $" + df.format(fries.getPrice()));
        System.out.println(burger + ": $" + df.format(burger.getPrice()));
        System.out.println(hotdog + ": $" + df.format(hotdog.getPrice()));

        System.out.println();

        System.out.println("Item prices after adding toppings:");

        System.out.println(fries + " with ketchup: $" + df.format(friesWithKetchup.getPrice()));
        System.out.println(burger + " with cheese and bacon: $" + df.format(burgerWithCheeseAndBacon.getPrice()));
        System.out.println(hotdog + " with bacon: $" + df.format(hotdogWithBacon.getPrice()));

        System.out.println();

        double totalCostBeforeDiscount = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + df.format(totalCostBeforeDiscount));

        double discountedCost = loyaltyStatus.applyDiscount(order);
        System.out.println("Discount: -$" + df.format(totalCostBeforeDiscount * loyaltyStatus.getDiscountRate()));
        System.out.println("Total cost after " + df.format(loyaltyStatus.getDiscountRate() * 100) + "% discount: $" + df.format(discountedCost));
    }
}