public class Homework {
    public static void main(String[] args) {
        int year = 2022;
        Homework homework = new Homework();
        homework.isLeapYearAndPrint(year);

        int clientOs = 0;
        homework.checkAndPrintSuitableOS(clientOs, year);

        int deliveryDistant = 95;
        System.out.println(homework.calculateDeliveryDays(deliveryDistant)+ " дня/ей");
    }

    public void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s год високосный\n", year);
        } else {
            System.out.printf("%s год не високосный\n", year);
        }
    }
    public void checkAndPrintSuitableOS(int clientOs, int year){
        if (clientOs == 0 && year >= 2022){
            System.out.println("Вам нужна современная версия для IOS");
        }else if (clientOs == 1 && year >= 2022) {
            System.out.println("Вам нужнаа современная версия Android");
        }else if (clientOs == 0 && year < 2022) {
            System.out.println("Вам нужна Lite версия для IOS");
        }else if (clientOs == 1 && year < 2022) {
            System.out.println("Вам нужна Lite версия для Android");
        }else {
            System.out.println();
        }
    }
    public int calculateDeliveryDays(int distance){
        if (distance<20 && distance> 0) {
            return 1;
        }else if (distance < 60 && distance >= 20){
            return 2;
        }else if (distance<100 && distance >= 60){
            return 3;
        } else {
            throw new RuntimeException ( "Доставка не возможна");
        }
    }
}





