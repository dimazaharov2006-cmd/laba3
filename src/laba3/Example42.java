package laba3;

import java.util.Scanner;
public class Example42 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int n = in.nextInt();

        System.out.println("Введите второе число: ");
        int m = in.nextInt();

        int min = Math.min(n,m);
        int max = Math.max(n,m);

        int i = min;

        while (i <= max){
            System.out.println(i + " ");
            i++;
        }

        in.close();
    }
}
