import java.util.Scanner;

public class q7 {

    private static void cal(int type, int time) {
        double callCharges = 0;

        switch (type) {
            case 186:
                callCharges = time * 0.09;
                if ((callCharges > type) && (callCharges >= type * 2)) {
                    callCharges *= 0.8;
                } else if (callCharges > type) {
                    callCharges *= 0.9;
                }
                break;
            case 386:
                callCharges = time * 0.08;
                if ((callCharges > type) && (callCharges >= type * 2)) {
                    callCharges *= 0.7;
                } else if (callCharges > type) {
                    callCharges *= 0.8;
                }
                break;
            case 586:
                callCharges = time * 0.07;
                if ((callCharges > type) && (callCharges >= type * 2)) {
                    callCharges *= 0.6;
                } else if (callCharges > type) {
                    callCharges *= 0.7;
                }
                break;
            case 986:
                callCharges = time * 0.06;
                if ((callCharges > type) && (callCharges >= type * 2)) {
                    callCharges *= 0.5;
                } else if (callCharges > type) {
                    callCharges *= 0.6;
                }
                break;
        }
        System.out.println("通話費為： " + (int)Math.round(callCharges));
    }

    public static void main(String[] args) {
        System.out.print("輸入月租費形式及通話時間為： ");
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(",");

        cal(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]));
    }

}
