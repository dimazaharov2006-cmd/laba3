package laba3;

import java.util.Scanner;
public class Example31 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = in.nextInt();

        long a = 1;
        long b = 1;

        for( int i = 0; i < n; i++){
            System.out.println(a + " ");

            long c = a + b;
            a = b;
            b = c;
        }
 in.close();
    }
}