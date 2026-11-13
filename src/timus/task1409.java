package timus;
import  java.util.Scanner;
public class task1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Harry = in.nextInt();
        int Larry = in.nextInt();

        int notHarry = Larry - 1;
        int notLarry = Harry - 1;

        System.out.println(notHarry + " " + notLarry);

        in.close();
    }
}
