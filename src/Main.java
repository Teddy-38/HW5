public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Task 2");
        int clientOSYear = 1;
        int clientDeviceYear = 2015;
        if (clientOSYear == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSYear == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSYear == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Task3");
        int year = 2021;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день, на расстояние = " + deliveryDistance);
        } else if (deliveryDistance >=20 && deliveryDistance <=60) {
                System.out.println("Потребуется 2 дня, расстояние = " + deliveryDistance);
        } else if (deliveryDistance >=60 && deliveryDistance <=100) {
            System.out.println("Потребуется 3 дня, расстояние = " + deliveryDistance);
        }else {
            System.out.println("Доставка не предусмотрена");
        }
        System.out.println("Task5");

    }
}