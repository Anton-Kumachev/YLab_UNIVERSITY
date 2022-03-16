package lecture03.task06;
//package com.javarush.task.task06.task0615;

/*
3. Переставь один модификатор static
Переставь один модификатор static, чтобы пример скомпилировался.
*/

import java.util.ArrayList;

public class Task06Solution12 {

    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
        System.out.println(A);
    }
}
