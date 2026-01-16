package CorePrograming.Programing_Elements.level1;

public class Profit {

    public static void main(String[] args) {
        double cp=129;
        double sp=191;
        double profit=sp-cp;
        double profitpercent=(profit/cp)*100;
        System.out.println(
                "The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\n" +
                        "The Profit is INR " + profit + " and the Profit Percentage is " + profitpercent);
    }
}


