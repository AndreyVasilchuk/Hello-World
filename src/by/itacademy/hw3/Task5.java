package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите целое число от 0 до 59: ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();

        if (min >= 0 && min <= 14) {
            System.out.println("В первую четверть часа.");
        } else if (min >= 15 && min <= 30) {
            System.out.println("Во вторую четверть часа.");
        } else if (min >= 31 && min <= 45) {
            System.out.println("В третью четверть часа.");
        } else {
            System.out.println("В четвертую четверть часа.");
        }
    }
}
