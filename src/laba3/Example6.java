package laba3;

import java.util.Scanner;
public class Example6 {
   public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        if (in.hasNextInt()) {
            int n = in.nextInt();

            if (n > 0 && n <= 10000) {

                int[] numbers = new int[n];
                for (int i = 0; i < n; i++) {
                    numbers[i] = 2 + i * 5;
                }

                    System.out.println("Элементы массива:");

                    for (int i = 0; i < n; i++) {
                        System.out.println(numbers[i] + " ");
                    }

            }else{
                System.out.println("Ошибка: размер массива должен быть от 1 до 10000");

            }

        }
        else {
            System.out.println("Ошибка: необходимо ввести целое число");
        }
    }

}

