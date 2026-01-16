package Object_Oriented.Java_Class_And_Object.level1;
class MobilePhone {
    String brand;
    String model;
    double price;

    void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "Galaxy S23";
        phone.price = 74999;

        phone.displayPhoneDetails();
    }
}

