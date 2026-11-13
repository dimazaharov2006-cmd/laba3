package laba3;

public class Example7 {
    static void main(String[] args) {

        int n = 10;

        char letters[] = new char[n];

        for (int i = 0; i < n; i++) {
            letters[i] = (char) ('a' + i * 2);
        }

        System.out.println("Прямой порядок: ");
        for (int i = 0; i < n; i++) {
            System.out.println(letters[i] + " ");
        }
        System.out.println("Обратный порядок: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(letters[i] + " ");


        }
    }
}
