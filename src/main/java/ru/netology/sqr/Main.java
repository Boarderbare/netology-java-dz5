package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int lowlimit = 2499;
        int uplimit = 2501;
        int count = service.calcCountSqr(lowlimit, uplimit);
        System.out.println("Количество квадратов: " + count);
    }
}
