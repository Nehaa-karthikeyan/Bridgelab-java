package CorePrograming.Programing_Elements.level1;

public class DiscountCalculation {

    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;

        System.out.println("Discount amount is INR " + discount);
        System.out.println("Fee to be paid after discount is INR " + discountedFee);
    }

}