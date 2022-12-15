package by.itacademy.hw3;

public class Task4 {
    public static void main(String[] args) {
        int a, b, c, min, max, middle;
        a = 9;
        b = 0;
        c = -6;
        if (a > b) {
            if (a > c) {
                max = a;
                if (c > b) {
                    middle = c;
                    min = b;
                } else {
                    middle = b;
                    min = c;
                }
            } else {
                max = c;
                middle = a;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (c > a) {
                    middle = c;
                    min = a;
                } else {
                    middle = a;
                    min = c;
                }
            } else {
                max = c;
                middle = b;
                min = a;
            }
        }
        System.out.println(min + " " + middle + " " + max);
    }
}
