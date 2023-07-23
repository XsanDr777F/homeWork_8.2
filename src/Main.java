import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkIsLeapYear(2020);
        checkIsLeapYear(2022);
        checkIsLeapYear(2026);
        checkOsYear(1, 2023);
        checkOsYear(0, 2015);

        deliveryDays(5);

    }

    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " высокостный год");
        } else {
            System.out.println(year + " не высокостный год");
        }
    }

    public static void checkOsYear(int mobileOs, int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        String mobileOsName;

        switch (mobileOs) {
            case 0:
                mobileOsName = "IOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "незвестная ОС";
        }
        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установите облегченную версию приложения");
        } else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию приложения");
        }
    }

    private static int deliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void printDeliveryDays(int distance) {
        int days = deliveryDays(distance);

        if (days > 0) {
            System.out.println("Потребуется дней для доставки " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}