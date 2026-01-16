package Object_Oriented.Java_Class_And_Object.level2;
class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double itemPrice, int qty) {
        itemName = name;
        price = itemPrice;
        quantity += qty;
        System.out.println("Item Added to Cart");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println("Item Removed from Cart");
        } else {
            System.out.println("Not enough quantity to remove");
        }
    }

    void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();

        cart.addItem("Pen", 10, 5);
        cart.removeItem(2);
        cart.displayTotalCost();
    }
}


