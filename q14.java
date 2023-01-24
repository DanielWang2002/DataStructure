import java.util.Scanner;

public class q14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一字串為： ");
        String s = scanner.nextLine();
        System.out.println(String.format("There are %s characters", s.length()));
    }

}
