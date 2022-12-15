package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число От 1 до 7: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1 || number > 7) {
            System.out.println("Ошибка. Введено число не из диапазона.");
        }
        String weekday = "";
        switch (number) {
            case (1):
                weekday = "Понедельник";
                break;
            case (2):
                weekday = "Вторник";
                break;
            case (3):
                weekday = "Среда";
                break;
            case (4):
                weekday = "Четверг";
                break;
            case (5):
                weekday = "Пятница";
                break;
            case (6):
            case (7):
                weekday = "Выходной";
                break;
        }
        System.out.println(weekday);

    }
}