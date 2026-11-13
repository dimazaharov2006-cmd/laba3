package laba3;

import java.util.Scanner;
public class Example32 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = in.nextInt();

        long a = 1;
        long b = 1;
        long i = 0;

       while (i < n) {
            System.out.println(a + " ");

            long c = a + b;
            a = b;
            b = c;

            i++;
        }
        in.close();
    }
}