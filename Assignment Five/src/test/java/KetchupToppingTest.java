import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KetchupToppingTest {

    @Test
    public void testGetPrice() {
        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        KetchupTopping ketchupTopping = new KetchupTopping(fries);

        double expected = 4.98;
        double price = ketchupTopping.getPrice();

        assertEquals(expected, price);
    }

    @Test
    public void testGetPriceWrong() {
        FoodItem fries = new BasicFoodItem("Fries", 3.99);
        KetchupTopping ketchupTopping = new KetchupTopping(fries);

        double expected = 5.00;
        double price = ketchupTopping.getPrice();

        assertEquals(expected, price);
    }
}
