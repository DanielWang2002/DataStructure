import java.util.Scanner;

public class q5 {

    private static void judge(int n) {
        int tmp = 2;
        int count = 2;
        while(tmp < n) {
            tmp *= count++;
        }
        System.out.println("超過M為" + n + "的最小階乘N值為： " + count);
    }

    public static void main(String[] args) {
        System.out.print("請輸入階乘值： ");
        Scanner sc = new Scanner(System.in);
        judge(sc.nextInt());
    }

}
