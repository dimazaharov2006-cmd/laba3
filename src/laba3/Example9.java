package laba3;

import java.util.Scanner;
import java.util.Random;
public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");

        if (in.hasNextInt()) {
            int n = in.nextInt();

            if (n > 0 && n <= 1000) {

                int[] numbers = new int[n];

                System.out.println("Элементы массива: ");

                for (int i = 0; i < n; i++) {
                    numbers[i] = random.nextInt(10);
                    System.out.println(numbers[i] + " ");
                }
                int min = numbers[0];

                for (int i = 1; i < n; i++) {
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                }
                System.out.println("Минимальное число: " + min);
                System.out.println("Индексы: ");
                for (int i = 0; i < n; i++){
                    if (numbers[i] == min){
                        System.out.println(i + " ");
                    }
                }
            } else {
                System.out.println("Некорректный размер массива");

            }
        } else {
            System.out.println("Введите целое число");

        }
    }
}