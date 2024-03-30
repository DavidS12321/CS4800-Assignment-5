public class BaconTopping extends ToppingDecorator {

    public BaconTopping(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + 1.50;
    }
}