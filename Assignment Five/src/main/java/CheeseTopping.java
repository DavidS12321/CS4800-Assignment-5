public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + 1.99;
    }
}