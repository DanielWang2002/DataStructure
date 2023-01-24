import java.util.Scanner;

public class q9 {

    private static String judge(String s1, String s2) {
        if (s2.contains(s1)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        System.out.print("輸入S1： ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.print("輸入S2： ");
        String s2 = sc.nextLine();
        System.out.println(judge(s1, s2));
    }

}
