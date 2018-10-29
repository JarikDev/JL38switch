import java.time.DayOfWeek;

public class Main {
    enum Days {MONDAY, THURSDAY, WEDNESDAY}

    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("default");
                break;

        }
        String s = "10";
        switch (s) {
            case "1":
                System.out.println("1");
            case "2":
                System.out.println("2");
            default:
                System.out.println("default");
            case "3":
                System.out.println("3");
            case "5":
                System.out.println("5");
            case "6":
                System.out.println("6");

        }


    }
}
