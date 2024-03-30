import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicFoodItemTest {

    @Test
    public void testGetPrice() {
        BasicFoodItem fries = new BasicFoodItem("Fries", 3.99);

        double expected = 3.99;
        double price = fries.getPrice();

        assertEquals(expected, price);
    }

    @Test
    public void testGetPriceWrong() {
        BasicFoodItem fries = new BasicFoodItem("Fries", 3.99);

        double expected = 4.00;
        double price = fries.getPrice();

        assertEquals(expected, price);
    }
}
