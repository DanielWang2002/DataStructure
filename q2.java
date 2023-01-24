import java.util.Scanner;

public class q2 {

    private static void calCharge(int e) {

        float ns = 0, s = 0;

        for (int i=1; i<=e; i++) {
            if (i >= 701) {
                s += 5.63;
                ns += 4.5;
            } else if (i >= 501) {
                s += 4.97;
                ns += 4.01;
            } else if (i >= 331) {
                s += 4.39;
                ns += 3.61;
            } else if (i >= 121) {
                s += 3.02;
                ns += 2.68;
            } else {
                s += 2.1;
                ns += 2.1;
            }   
        }

        System.out.println((float) Math.round(s * 100) / 100);
        System.out.println((float) Math.round(ns * 100) / 100);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calCharge(scanner.nextInt());
    }

}
