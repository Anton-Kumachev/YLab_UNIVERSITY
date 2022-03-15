package lecture02.homework.task04;
//package com.javarush.task.task04.task0435;

/*
1. Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

import java.io.IOException;

public class Task04Solution17 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        for(int i = 1; i <= 100; i++ ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
