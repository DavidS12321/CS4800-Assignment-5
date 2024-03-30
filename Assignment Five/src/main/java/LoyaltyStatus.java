public class LoyaltyStatus {
    private double discountRate;

    public LoyaltyStatus(double discountRate) {
        this.discountRate = discountRate;
    }

    public double applyDiscount(Order order) {
        double totalCost = order.calculateTotalCost();
        return totalCost * (1 - discountRate);
    }

    public double getDiscountRate(){
        return  discountRate;
    }
}