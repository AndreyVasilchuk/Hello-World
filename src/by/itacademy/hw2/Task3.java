package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args) {
        long intervalSec=1234567;

        long weeks=intervalSec/(3600*24*7);
        long ostatok=intervalSec%(3600*24*7);
        long days=ostatok/(3600*24);
        ostatok=ostatok%(3600*24);
        long hours=ostatok/3600;
        ostatok= ostatok%3600;
        long min= ostatok/60;
        long sec= ostatok%60;
        System.out.println("Недель " + weeks+" Дней "+days+" Часов "+ hours+" Минут "+min+" Секунд "+sec);
    }





}
