package by.itacademy.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (!isEven(number)) {
            System.out.println("Введеное число " + number + " нечетное");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0 && number != 0;
    }
}
