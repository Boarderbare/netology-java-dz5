package ru.netology.sqr;

public class SQRService {
    public int calcCountSqr(int lowlimit, int uplimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowlimit && i * i <= uplimit) {
                count++;
            }
        }
        return count;
    }
}
