package lecture01.homework.task03;
//package com.javarush.task.task03.task0308;

/*Произведение 10 чисел
Вывести на экран произведение чисел от 1 до 10.
Подсказка: будет три миллиона с хвостиком */

public class Task03Solution04 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
