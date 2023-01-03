public class Main {
    public static void main(String[] args) {


        //Задача 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите клиент IOS по ссылке");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите клиент Android по ссылке");


            }

        }
        //Задача 2
        int clientOs = 0;
        int clientDeviceYear = 2016;
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию IOS по ссылке");
            } else {
                System.out.println("Установите версию IOS по ссылке"); }
        } else {
            if (clientOs == 0) {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию Android по ссылке");
                } else {
                    System.out.println("Установите версию Android по ссылке");
                }
            }
            //Задача 3
            int year = 2020;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(+year + " год является високосним");
            } else {
                System.out.println(+year + " год не является високосним");
            }
        //Задача 4
            int deliveryDistance = 95;
            if (deliveryDistance < 20) {
                System.out.println("доставка занимает 1 день");
            } else if (deliveryDistance < 60) {
                System.out.println("доставка занимает 2 дня");
            } else if (deliveryDistance <100) {
                System.out.println("доставка занимает 3 дня");
            } else {
                System.out.println("доставки нет");
            }
        // Задача 5
            int monthNumber = 11;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Некорректный месяц");
            }

        }
    }
}