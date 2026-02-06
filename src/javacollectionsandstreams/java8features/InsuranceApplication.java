package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InsuranceApplication {

    // -------------------- MODEL CLASS --------------------
    static class Policy {
        private String policyNumber;
        private String holderName;
        private double premiumAmount;

        public Policy(String policyNumber, String holderName, double premiumAmount) {
            this.policyNumber = policyNumber;
            this.holderName = holderName;
            this.premiumAmount = premiumAmount;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public String getHolderName() {
            return holderName;
        }

        public double getPremiumAmount() {
            return premiumAmount;
        }

        @Override
        public String toString() {
            return "Policy{" +
                    "policyNumber='" + policyNumber + '\'' +
                    ", holderName='" + holderName + '\'' +
                    ", premiumAmount=" + premiumAmount +
                    '}';
        }
    }

    // -------------------- MAIN METHOD --------------------
    public static void main(String[] args) {

        List<Policy> policies = Arrays.asList(
                new Policy("P101", "Alice Smith", 1500),
                new Policy("P102", "Bob Johnson", 900),
                new Policy("P103", "Charlie Brown", 2200),
                new Policy("P104", "David Smith", 1800),
                new Policy("P105", "Emma Watson", 1200)
        );

        // 1️⃣ Filter Policies with Premium > 1200
        System.out.println("\n1. Policies with Premium > 1200");
        policies.stream()
                .filter(p -> p.getPremiumAmount() > 1200)
                .forEach(System.out::println);

        // 2️⃣ Sort Policies by Holder Name
        System.out.println("\n2. Policies Sorted by Holder Name");
        policies.stream()
                .sorted(Comparator.comparing(Policy::getHolderName))
                .forEach(System.out::println);

        // 3️⃣ Compute Total Premium
        double totalPremium = policies.stream()
                .mapToDouble(Policy::getPremiumAmount)
                .sum();
        System.out.println("\n3. Total Premium = " + totalPremium);

        // 4️⃣ Print Policy Details
        System.out.println("\n4. Policy Details");
        policies.forEach(p ->
                System.out.println(p.getPolicyNumber() + " | " +
                        p.getHolderName() + " | $" + p.getPremiumAmount()));

        // 5️⃣ Filter Policies by Premium Range (1000–2000)
        System.out.println("\n5. Policies with Premium between 1000 and 2000");
        policies.stream()
                .filter(p -> p.getPremiumAmount() >= 1000 && p.getPremiumAmount() <= 2000)
                .forEach(System.out::println);

        // 6️⃣ Policy with Highest Premium
        Policy highestPremiumPolicy = policies.stream()
                .max(Comparator.comparing(Policy::getPremiumAmount))
                .orElse(null);
        System.out.println("\n6. Policy with Highest Premium");
        System.out.println(highestPremiumPolicy);

        // 7️⃣ Group Policies by Holder Name Initial
        System.out.println("\n7. Group Policies by Holder Initial");
        Map<Character, List<Policy>> groupedByInitial =
                policies.stream()
                        .collect(Collectors.groupingBy(
                                p -> p.getHolderName().charAt(0)));

        groupedByInitial.forEach((k, v) ->
                System.out.println(k + " -> " + v));

        // 8️⃣ Compute Average Premium
        double averagePremium = policies.stream()
                .mapToDouble(Policy::getPremiumAmount)
                .average()
                .orElse(0);
        System.out.println("\n8. Average Premium = " + averagePremium);

        // 9️⃣ Sort Policies by Premium and Print
        System.out.println("\n9. Policies Sorted by Premium");
        policies.stream()
                .sorted(Comparator.comparing(Policy::getPremiumAmount))
                .forEach(System.out::println);

        // 🔟 Check if Any Policy Exceeds 2000
        boolean anyAbove2000 = policies.stream()
                .anyMatch(p -> p.getPremiumAmount() > 2000);
        System.out.println("\n10. Any policy above 2000? " + anyAbove2000);

        // 1️⃣1️⃣ Count Policies by Premium Range
        System.out.println("\n11. Count Policies by Premium Range");
        Map<String, Long> premiumRanges = policies.stream()
                .collect(Collectors.groupingBy(p -> {
                    if (p.getPremiumAmount() <= 1000) return "0-1000";
                    else if (p.getPremiumAmount() <= 2000) return "1001-2000";
                    else return ">2000";
                }, Collectors.counting()));

        premiumRanges.forEach((k, v) ->
                System.out.println(k + " : " + v));

        // 1️⃣2️⃣ Extract Unique Holder Names
        System.out.println("\n12. Unique Holder Names");
        policies.stream()
                .map(Policy::getHolderName)
                .distinct()
                .forEach(System.out::println);

        // 1️⃣3️⃣ Find Policies by Holder Name Substring ("Smith")
        System.out.println("\n13. Policies with Holder Name containing 'Smith'");
        policies.stream()
                .filter(p -> p.getHolderName().contains("Smith"))
                .forEach(System.out::println);

        // 1️⃣4️⃣ Map Policy Number to Premium Amount
        System.out.println("\n14. Policy Number to Premium Map");
        Map<String, Double> policyMap =
                policies.stream()
                        .collect(Collectors.toMap(
                                Policy::getPolicyNumber,
                                Policy::getPremiumAmount));

        policyMap.forEach((k, v) ->
                System.out.println(k + " -> " + v));

        // -------------------- TEXT PROCESSING --------------------

        String text = "Java Java Python Java Streams Streams Streams Lambda Lambda";

        // 1️⃣5️⃣ Most Frequent Words
        System.out.println("\n15. Most Frequent Words");
        Map<String, Long> wordCount =
                Arrays.stream(text.toLowerCase().split("\\s+"))
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()));

        wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));

        // 1️⃣6️⃣ Second Most Repeated Word
        System.out.println("\n16. Second Most Repeated Word");
        wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .ifPresent(e ->
                        System.out.println(e.getKey() + " : " + e.getValue()));
    }
}

