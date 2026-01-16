package objectoriented.keywords.Level1;

class Product {
    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display(Object obj) {
        if (obj instanceof Product) {
            System.out.println(productName + " | " + price + " | " + productID);
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Pen", 10, 5, 301);
        p.display(p);
        Product.updateDiscount(15);
    }
}

