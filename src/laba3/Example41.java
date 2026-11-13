package laba3;

import java.util.Scanner;
public class Example41 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int n = in.nextInt();

        System.out.println("Введите второе число: ");
        int m = in.nextInt();

        int min = Math.min(n,m);
        int max = Math.max(n,m);

        for (long i = min; i <= max; i++){
            System.out.println(i + " ");
        }

        in.close();
    }
}
