public class KetchupTopping extends ToppingDecorator {

    public KetchupTopping(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + 0.99;
    }
}