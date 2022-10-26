import java.time.LocalDate;

public class Main {

    public static void isItALeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високостным");
        } else System.out.println(year + " год не является високостным");
    }
    public static void appVersion(int clientDeviceYear, byte clientOS) {

        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 1) {
                System.out.println("Установите версию облегченную приложения для Android по ссылке: ");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");

        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else System.out.println("Установите версию приложения для iOS по ссылке: ");
    }
    public static void requiredDays(int deliveryDistance) {

        int oneDay = 40;
        int requiredDays = (deliveryDistance - 20) / oneDay + 1;
        System.out.println("Потребуется дней: " + requiredDays);

    }

    public static void main(String[] args) {

        int year = 2021;
        isItALeapYear(year);

        byte clientOS = 0;
        int clientDeviceYear = 2020;
        appVersion(clientDeviceYear, clientOS);

        int deliveryDistance = 95;
        requiredDays(deliveryDistance);

    }
}
