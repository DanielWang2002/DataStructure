import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
        String[] starSign = {"Aquarius", "Leo", "Pisces", "Virgo", "Aries", "Libra", "Taurus", "Scorpio", "Gemini", "Sagittarius", "Cancer", "Capricorn"};
        System.out.print("輸入月及日： ");
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");
        String month = tmp[0];
        int day = Integer.parseInt(tmp[1]);
        String result = "";

        switch (month) {
            case "01":
                result = (day < 21) ? "Capricorn" : "Aquarius";
                break;
            case "02":
                result = (day < 19) ? "Aquarius" : "Pisces";
            case "03":
                result = (day < 21) ? "Pisces" : "Aries";
                break;
            case "04":
                result = (day < 21) ? "Aries" : "Taurus";
                break;
            case "05":
                result = (day < 22) ? "Taurus" : "Gemini";
                break;
            case "06":
                result = (day < 22) ? "Gemini" : "Cancer";
                break;
            case "07":
                result = (day < 23) ? "Cancer" : "Leo";
                break;
            case "08":
                result = (day < 24) ? "Leo" : "Virgo";
                break;
            case "09":
                result = (day < 24) ? "Virgo" : "Libra";
                break;
            case "10":
                result = (day < 24) ? "Libra" : "Scorpio";
                break;
            case "11":
                result = (day < 23) ? "Scorpio" : "Sagittarius";
                break;
            case "12":
                result = (day < 22) ? "Sagittarius" : "Capricorn";
                break;
        }
        System.out.println(result);

    }

}
