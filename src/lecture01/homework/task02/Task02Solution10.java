package lecture01.homework.task02;
//package com.javarush.task.task02.task0217;

/*
Минимум четырёх чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
*/

public class Task02Solution10 {

    public static int min(int a, int b, int c, int d) {

        if (min(a, b) <= c && min(a, b) <= d ) {
            return min(a, b);}

        else if (c <= min(a, b) && c <= d ) {
            return c;}
        else {
            return d;}
    }

    public static int min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
