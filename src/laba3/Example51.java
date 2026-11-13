package laba3;

import java.util.Scanner;
public class Example51 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        int n = in.nextInt();

        long a = 0;
        int b = 0;

        if (n > 0) {
            for (long i = 1; b < n; i++) {
                if (i % 5 == 2 && i % 3 == 1) {
                    System.out.println(i);
                    a = a + i;
                    b++;
                }
            }
        }
        System.out.println("Сумма: " + a);
        in.close();
    }
}
