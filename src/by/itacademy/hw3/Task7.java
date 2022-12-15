package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();
        System.out.println("Введите результат умножения первого числа на второе:");
        int resultat = scanner.nextInt();

        if (resultat == a * b) {
            System.out.println("Вы правильно ответили результат умножения");
        } else System.out.println("Нет. Не правильно. Результат умножения равен " + a * b);
    }
}
