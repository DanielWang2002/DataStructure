import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q8 {

    private static HashMap<String, Integer> allCountOf(String[] s) {
        HashMap<String, Integer> hashMap = new HashMap();
        // 1 4 6 2 3 5 8 7
        // 4 4 6 2 3 5 8 7
        for (int i=0; i<s.length; i++) {
            if (hashMap.containsKey(s[i])) {
                hashMap.put(s[i], hashMap.get(s[i]) + 1);
            } else {
                hashMap.put(s[i], 1);
            }
        }

        return hashMap;

    }

    public static void main(String[] args) {
        System.out.print("輸入第一行正整數為： ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        System.out.print("第二行中數列中的數字為： ");
        String[] nums = sc.nextLine().split(" ");
        HashMap<String, Integer> hashMap = allCountOf(nums);

        int max = -1;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if ((entry.getValue() > 1) && (entry.getValue() > max)) {
                max = entry.getValue();
            }
        }
        if (max == -1) {
            System.out.println("每個數字剛好只出現一次");
        } else {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {

                if (entry.getValue() == max) {
                    System.out.println("最大出現次數的數字為： " + entry.getKey());
                    System.out.println("出現次數為： " + max);
                    break;
                }

            }
        }

    }

}
