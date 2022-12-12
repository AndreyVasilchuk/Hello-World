package by.itacademy.hw2;

public class Task5 {
    public static void main(String[] args) {
        String s=isEven(6)? "Число четное": "Число нечетное";
        System.out.println(s);

    }
    public static boolean isEven(int number)
        {
            return number%2==0 && number!=0;
        }
}
