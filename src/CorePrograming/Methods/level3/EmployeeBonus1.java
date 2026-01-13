package CorePrograming.Methods.level3;

import java.util.Random;

public class EmployeeBonus1 {

    // Method to generate random salaries and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]

        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(10);         // 1 to 10 years of service
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {
        int n = employeeData.length;
        double[][] newData = new double[n][2]; // [newSalary, bonusAmount]

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus = 0;
            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Method to calculate total old salary, total new salary and total bonus
    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] bonusData = calculateBonus(employeeData);
        displaySummary(employeeData, bonusData);
    }
}


