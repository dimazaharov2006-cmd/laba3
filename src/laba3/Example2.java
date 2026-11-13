package laba3;

import java.util.Scanner;
public class Example2 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели (с большой буквы)");

        String day = in.nextLine();

        switch (day){
            case "Понедельник":
                System.out.println("Номер дня: 1");
                break;
            case "Вторник":
                System.out.println("Номер дня: 2");
                break;
            case "Среда":
                System.out.println("Номер дня: 3");
                break;
            case "Четверг":
                System.out.println("Номер дня: 4");
                break;
            case "Пятница":
                System.out.println("Номер дня: 5");
                break;
            case "Суббота":
                System.out.println("Номер дня: 6");
                break;
            case "Воскресенье":
                System.out.println("Номер дня: 7");
                break;
            default:
                System.out.println("Такого дня нет");
        }
in.close();
    }
}
