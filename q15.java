import java.util.Scanner;

public class q15 {

    private static String swap(String s, int targetIndex1, int targetIndex2) {
        String ret = "";
        String target1 = s.substring(targetIndex1, targetIndex1+1);
        String target2 = s.substring(targetIndex2, targetIndex2+1);
        for (int i=0; i<s.length(); i++) {
            if ((i != targetIndex1) && (i != targetIndex2)) {
                ret += s.substring(i, i+1);
            } else if (i == targetIndex1) {
                ret += target2;
            } else {
                ret += target1;
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一組四位數字： ");
        String s = scanner.nextLine();
        String newS = "";
        for (int i=0; i<s.length(); i++) {
            int tmpS = Integer.parseInt(s.substring(i, i+1));
            newS += String.valueOf((tmpS + 7) % 10);
        }
        System.out.println(swap(swap(newS, 0, 2), 1, 3));

    }

}
