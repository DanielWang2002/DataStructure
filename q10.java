import java.util.Scanner;

public class q10 {

    private static void convert(String[][] strings, int n, int m) {

        for (int i=0; i<m; i++) {
            String text = String.format("輸出矩陣第%d列： ", i+1);
            for (int k=0; k<n; k++) {
                text += strings[k][i] + " ";
//                System.out.println(i + " " + k + " " + strings[i][k]);
            }
            System.out.println(text.trim());
        }

    }

    public static void main(String[] args) {
        System.out.print("輸入N及M： ");
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        String[][] strings = new String[n][m];

        for (int i=0; i<n; i++) {
            System.out.printf("輸入矩陣數值第%d列為： ", i+1);
            strings[i] = sc.nextLine().split(" ");
        }

        convert(strings, n , m);

    }

}
