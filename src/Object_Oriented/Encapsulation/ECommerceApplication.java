package Object_Oriented.Encapsulation;
abstract class Product {
    private int productId;
    private String name;
    protected double price;

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
}

class Electronics extends Product implements Taxable {
    public double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }
}

