import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q16a {

    private static int a(String[] card) {
        // 同花順

        // 檢查花色是否都相同
        for (String value : card) {
            for (String s : card) {
                if (!value.substring(0, 1).equals(s.substring(0, 1))) return 0;
            }
        }

        // 檢查是否為順子
        ArrayList<Integer> card_number = new ArrayList<>();
        for (String s : card) {
            card_number.add(Integer.parseInt(s.substring(1)));
        }
        Collections.sort(card_number);

        for (int i=0; i<card_number.size()-1; i++) {
            if (card_number.get(i) - card_number.get(i+1) != -1) return 0;
        }

        return 7;

    }
    
    private static int b(String[] card) {
        // 四條

        for (String s : card) {
            int count = 0;
            for (String ss : card) {
                if (s.substring(1).equals(ss.substring(1))) count++;
            }
            if (count == 4) return 6;
        }

        return 0;
    }

    private static int c(String[] card) {
        // 葫蘆

        for (String s : card) {
            int count = 0;
            for (String ss : card) {
                if (s.substring(1).equals(ss.substring(1))) count++;
            }
            if (count == 3) {
                for (String ss : card) {
                    int count2 = 0;
                    for (String sss : card) {
                        if ((ss.substring(1).equals(sss.substring(1))) && (!ss.equals(s))) count2++;
                    }
                    if (count2 == 2) return 5;
                }
            }
        }

        return 0;
    }

    private static int d(String[] card) {
        // 順子

        ArrayList<Integer> card_number = new ArrayList<>();
        for (String s : card) {
            card_number.add(Integer.parseInt(s.substring(1)));
        }
        Collections.sort(card_number);

        for (int i=0; i<card_number.size()-1; i++) {
            if (card_number.get(i) - card_number.get(i+1) != -1) return 0;
        }

        return 4;
    }

    private static int e(String[] card) {
        // 三條

        for (String s : card) {
            int count = 0;
            for (String ss : card) {
                if (s.substring(1).equals(ss.substring(1))) count++;
            }
            if (count == 3) return 3;
        }

        return 0;
    }

    private static int f(String[] card) {
        // 兩對
        String firstPair = "";
        for (String s : card) {
            for (String ss : card) {
                if (s.equals(ss)) {
                    firstPair = s;
                    break;
                }
            }
        }
        for (String s : card) {
            for (String ss : card) {
                if ((s.equals(ss)) && !s.equals(firstPair)) return 2;
            }
        }

        return 0;
    }

    private static int g(String[] card) {
        // 一對
        for (String s : card) {
            for (String ss : card) {
                if (s.equals(ss)) return 1;
            }
        }

        return 0;
    }

    private static int judge(String[] card) {
        int ret = a(card);
        ret = Math.max(ret, b(card));
        ret = Math.max(ret, c(card));
        ret = Math.max(ret, d(card));
        ret = Math.max(ret, e(card));
        ret = Math.max(ret, f(card));
        ret = Math.max(ret, g(card));
        return ret;
    }

    private static int compare(String[] cardA, String[] cardB) {
        return (judge(cardA) > judge(cardB)) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String foo = "0";
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(foo.equals("0")) {
            String[] cardA = scanner.nextLine().split(" ");
            String[] cardB = scanner.nextLine().split(" ");
            foo = scanner.nextLine();
            arrayList.add(compare(cardA, cardB));
        }

        for (int element : arrayList) {
            System.out.println(element);
        }
    }

}
