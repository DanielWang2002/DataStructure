import java.util.Scanner;

public class q17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] card = scanner.nextLine().split(" ");

        int sum = 0;
        for (String s : card) {
            if (s.equals("A")) {
                sum += 1;
            } else if (s.equals("J")) {
                sum += 11;
            } else if (s.equals("Q")) {
                sum += 12;
            } else if (s.equals("K")) {
                sum += 13;
            } else {
                sum += Integer.parseInt(s);
            }
        }

        System.out.println(sum);
    }

}
