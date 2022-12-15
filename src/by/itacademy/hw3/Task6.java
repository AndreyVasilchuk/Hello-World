package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой сторону треугльника: ");
        float a = scanner.nextFloat();
        System.out.println("Введите длину второй сторону треугльника: ");
        float b = scanner.nextFloat();
        System.out.println("Введите длину третьей сторону треугльника: ");
        float c = scanner.nextFloat();

        if (((b + c - a) > 0) && ((a + c - b) > 0) && ((a + b - c) > 0)) {
            System.out.println("Треугольник существует");
        } else
            System.out.println("Треугольник не существует");


    }
}
