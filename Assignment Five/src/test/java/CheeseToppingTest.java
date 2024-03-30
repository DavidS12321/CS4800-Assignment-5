import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheeseToppingTest {

    @Test
    public void testGetPrice() {

        FoodItem burger = new BasicFoodItem("Burger", 5.99);
        CheeseTopping cheeseTopping = new CheeseTopping(burger);

        double expected = 7.98;
        double price = cheeseTopping.getPrice();

        assertEquals(expected, price);
    }

    @Test
    public void testGetPriceWrong() {

        FoodItem burger = new BasicFoodItem("Burger", 5.99);
        CheeseTopping cheeseTopping = new CheeseTopping(burger);

        double expected = 8.00;
        double price = cheeseTopping.getPrice();

        assertEquals(expected, price);
    }
}
