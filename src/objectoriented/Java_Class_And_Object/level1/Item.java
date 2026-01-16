package Object_Oriented.Java_Class_And_Object.level1;
class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    void calculateTotalCost(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 201;
        item.itemName = "Notebook";
        item.price = 50;

        item.displayItemDetails();
        item.calculateTotalCost(10);
    }
}

