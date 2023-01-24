import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q6 {

    private static int[] arrayReverse(int[] target) {
        int[] ret = new int[target.length];
        int tmp = 0;
        for (int i=target.length-1; i>=0; i--) {
            ret[tmp++] = target[i];
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.print("輸入值為： ");
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(",");
        int[] values = new int[s.length];
        for (int i=0; i<s.length; i++) {
            values[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(values);

        String tmp = "";
        for (int i=0; i<values.length; i++) {
            tmp += values[i];
        }
        String tmp2 = "";
        values = arrayReverse(values);
        for (int i=0; i<values.length; i++) {
            tmp2 += values[i];
        }
        int ans = Integer.parseInt(tmp2) - Integer.parseInt(tmp);
        System.out.println("最大值數列與最小值數列差值為： " + ans);
    }

}
