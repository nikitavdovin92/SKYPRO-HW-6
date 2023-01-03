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

        }
    }
}