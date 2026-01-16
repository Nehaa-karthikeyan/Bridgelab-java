package CorePrograming.Methods.level2;

import java.util.Arrays;

public class RandomStats {

    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; // ensures 4-digit
        }
        return arr;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for(int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double)sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        RandomStats rs = new RandomStats();

        int[] randomNumbers = rs.generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit numbers: " + Arrays.toString(randomNumbers));

        double[] results = rs.findAverageMinMax(randomNumbers);

        System.out.println("Average = " + results[0]);
        System.out.println("Minimum = " + results[1]);
        System.out.println("Maximum = " + results[2]);
    }
}


