import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyStatusTest {

    @Test
    public void testApplyDiscount() {

        Order order = new Order();
        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        order.addItem(fries);
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.10);

        double expected = 3.59;
        double discountedCost = loyaltyStatus.applyDiscount(order);
        double delta = 0.01;

        assertEquals(expected, discountedCost, delta);
    }

    @Test
    public void testApplyDiscountWrong() {

        Order order = new Order();
        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        order.addItem(fries);
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.10);

        double expected = 3.60;
        double discountedCost = loyaltyStatus.applyDiscount(order);

        assertEquals(expected, discountedCost);
    }
}
