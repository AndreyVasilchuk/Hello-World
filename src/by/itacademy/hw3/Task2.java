package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((!isEven(number)) && number > 0) {
            System.out.println("Введеное число " + number + " нечетное положительное");
        } else if ((isEven(number)) && number < 0) {
            System.out.println("Введеное число " + number + " четное отрицательное");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0 && number != 0;
    }

}
