package lecture01.homework.task02;

/*
Максимум двух чисел
Написать функцию, которая вычисляет максимум из двух чисел.
*/

public class Task02Solution08 {

    public static int max(int a, int b) {
        int m;
        if (a > b)
            m = a;
        else
            m = b;
        return m;
    }

    public static void main(String[] args) {
        System.out.println(max(12, 33));
        System.out.println(max(-20, 0));
        System.out.println(max(-10, -20));
    }
}
