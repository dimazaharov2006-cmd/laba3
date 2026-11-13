package laba3;

import java.util.Random;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int n = 10;
        int[] numbers = new int[n];

        System.out.println("Исходный массив: ");

        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i] + " ");
        }
        for (int i = 0; i < n; i++){
            for (int b = 0; b < n - 1 - i; b++){
                if (numbers[b] < numbers[b + 1]){
                    int c = numbers [b];
                    numbers[b] = numbers[b + 1];
                    numbers[b + 1] = c;
                }
            }
        }
        System.out.println("Массив по убыванию: ");

        for (int i = 0; i < n; i++){
            System.out.println(numbers[i] + " ");
        }
    }
}
