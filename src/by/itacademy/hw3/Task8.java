package by.itacademy.hw3;

public class Task8 {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 28800), hours;
        if (time < 3600) {
            System.out.println(time + "\n" + "До конца рабочего дня осталось менее часа");
        } else {
            hours = (int) (time / 3600);
            System.out.println(time + "\n" + "До конца рабочего дня осталось " + hours + " часов");
        }
    }
}
