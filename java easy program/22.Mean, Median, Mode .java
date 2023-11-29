import java.util.*;

public class StatsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        int mode = calculateMode(numbers);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        scanner.close();
    }
    static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
    static double calculateMedian(int[] arr) {
        int length = arr.length;
        if (length % 2 == 0) {
            return (double) (arr[length / 2] + arr[length / 2 - 1]) / 2;
        } else {
            return arr[length / 2];
        }
    }
    static int calculateMode(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > maxFrequency) {
                maxFrequency = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;
    }
}
OUTPUT:
Enter the number of elements in the array: 6
Enter the elements of the array:
16
17
18
27
23
21
Mean: 20.333333333333332
Median: 19.5
Mode: 16
