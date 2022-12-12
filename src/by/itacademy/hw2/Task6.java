package by.itacademy.hw2;

public class Task6 {

    public static void main(String[] args) {
        float a= -3.56f;
        float b=-1.82f;
        float c=5.96f;

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        System.out.println(a + " "+ b+ " "+c);

        float tmp = Math.min(a,b);
        float min = Math.min(tmp, c);
        System.out.println("Наименьшее вещественное число по модулю:\n" + min);
    }
}



