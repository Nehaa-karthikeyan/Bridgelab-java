package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;

class Product {
    String productName;     // instance variable
    double price;           // instance variable
    static int totalProducts = 0; // class variable

    Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    void displayProductDetails() {
        System.out.println(productName + " | Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Notebook", 50);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}

