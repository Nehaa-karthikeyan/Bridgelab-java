package Object_Oriented.DesignPrinciples;
import java.util.ArrayList;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

class Customers {
    String name;

    Customers(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed an order");
    }
}

public class ECommerceTest {
    public static void main(String[] args) {
        Customer c = new Customer("Nehaa");
        Order o = new Order();

        o.addProduct(new Product("Laptop"));
        c.placeOrder(o);
    }
}

