import java.util.Scanner;

public class q12 {

    private static String judge(String[] s) {
        for (String tmp1 : s) {
            int count = 0;
            for (String tmp2 : s) {
                if (tmp1.equals(tmp2)) count++;
            }
            if (count > (s.length / 2)) return ("過半元素為： " + tmp1);
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一整數序列為： ");
        String[] s = scanner.nextLine().split(" ");
        System.out.println(judge(s));
    }

}
