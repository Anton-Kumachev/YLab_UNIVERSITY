package lecture01.homework.task03;
//package com.javarush.task.task03.task0309;

/* Сумма 10 чисел

Вывести на экран сумму чисел от 1 до 10 построчно */

public class Solution05task03 {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result +=i;

            System.out.println(result);

        }
    }
}