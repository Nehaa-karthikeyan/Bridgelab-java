package Object_Oriented.Inheritance;
class Order {
    int orderId;
    String orderDate;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
}

