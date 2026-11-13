package laba3;

public class Example8 {
    static void main(String[] args) {

        int n = 10;

        char letters[] = new char[n];

        int i = 0;

        for (char a = 'A'; i < n; a++){
            if (a == 'A' || a == 'E' || a == 'I'){
                continue;
            }
            letters[i] = a;
            i++;

        }
        System.out.println("Элементы массива:");

        for ( int b = 0; b < n; b++){
            System.out.println(letters[b] + " ");
        }
    }
}