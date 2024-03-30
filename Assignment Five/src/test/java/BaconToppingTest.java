import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaconToppingTest {

    @Test
    public void testGetPrice() {

        FoodItem hotdog = new BasicFoodItem("Hotdog", 4.99);
        BaconTopping baconTopping = new BaconTopping(hotdog);

        double expected = 6.49;
        double price = baconTopping.getPrice();

        assertEquals(expected, price);
    }

    @Test
    public void testGetPriceWrong() {

        FoodItem hotdog = new BasicFoodItem("Hotdog", 4.99);
        BaconTopping baconTopping = new BaconTopping(hotdog);

        double expected = 6.50;
        double price = baconTopping.getPrice();

        assertEquals(expected, price);
    }
}
