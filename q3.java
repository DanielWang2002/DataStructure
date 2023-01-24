import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        String[] s = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "rooster", "dog", "pig"};

        Scanner scanner = new Scanner(System.in);
        System.out.println(s[scanner.nextInt()%12 - 4]);

    }

}
