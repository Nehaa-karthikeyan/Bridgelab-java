package Object_Oriented.Encapsulation;
abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
}

