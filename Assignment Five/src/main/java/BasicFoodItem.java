public class BasicFoodItem implements FoodItem {

    private String name;
    private double price;

    public BasicFoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return name;
    }
}