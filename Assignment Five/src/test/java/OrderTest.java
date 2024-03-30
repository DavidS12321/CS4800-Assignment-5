import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testCalculateTotalCost() {

        Order order = new Order();
        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        FoodItem burger = new BasicFoodItem("Burger", 5.99);
        order.addItem(fries);
        order.addItem(burger);

        double expected = 9.98;
        double totalCost = order.calculateTotalCost();

        assertEquals(expected, totalCost);
    }

    @Test
    public void testCalculateTotalCostWrong() {

        Order order = new Order();
        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        FoodItem burger = new BasicFoodItem("Burger", 5.99);
        order.addItem(fries);
        order.addItem(burger);

        double expected = 10.00;
        double totalCost = order.calculateTotalCost();

        assertEquals(expected, totalCost);
    }
}
