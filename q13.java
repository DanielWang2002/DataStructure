import java.util.Scanner;

public class q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一字元為： ");
        String s = scanner.nextLine();
        String tmpS = "";
        for (int i=s.length()-1; i>=0; i--) {
            tmpS += s.substring(i, i+1);
        }
        if (s.equals(tmpS)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
