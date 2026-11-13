package laba3;

import java.util.Scanner;
public class Example52 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        int n = in.nextInt();

        long a = 0;
        int b = 0;
        long i = 1;

        if (n > 0) {

            while (b < n) {
                if (i % 5 == 2 && i % 3 == 1) {
                    System.out.println(i);
                    a = a + i;
                    b++;
                    i++;
                }
            }
        }
        System.out.println("Сумма: " + a);
        in.close();
    }
}
