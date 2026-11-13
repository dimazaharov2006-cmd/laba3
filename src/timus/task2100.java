package timus;
import java.util.Scanner;
public class task2100 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int guests = n + 2;

        for (int i = 0; i < n; i++) {
            String name = in.next();
            if (name.endsWith("+one")) {
                guests++;
            }}
            if (guests == 13) {
                guests++;
            }
            int sum = guests * 100;

            System.out.println(sum);
        }
    }

