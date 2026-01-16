package CorePrograming.Programing_Elements.level2;
import java.util.Scanner;
public class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traveler name: ");
        String name = sc.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = sc.nextDouble();
        System.out.print("Enter time taken for this travel (in minutes): ");
        int timeFromToVia = sc.nextInt();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = sc.nextDouble();
        System.out.print("Enter time taken for this final travel (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("\n--- Travel Summary ---");
        System.out.println(name + " travelled from " + fromCity + " via " + viaCity + " to " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time: " + totalTime + " minutes");
        sc.close();
    }
}
