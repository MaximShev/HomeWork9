import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задача 1
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    // Задача 2
    public static void task2() {
        int[] arr = generateRandomArray();
        int totalMax = Arrays.stream(arr).max().getAsInt();
        int totalMin = Arrays.stream(arr).min().getAsInt();
        System.out.println("Минимальная сумма трат за день составила " + totalMin + " рублей. Максимальная сумма трат за день составила " + totalMax + " рублей");
    }

    // Задача 3
    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double averageSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
    }

    // Задача 4
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a = 0;
        for(int i = reverseFullName.length-1; i>=0; i--) {
             a+=reverseFullName[i];
            System.out.print(reverseFullName[i]); }
        }
    }