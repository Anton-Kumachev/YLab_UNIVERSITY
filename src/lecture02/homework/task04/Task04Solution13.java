package lecture02.homework.task04;
//package com.javarush.task.task04.task0431;

/*
2. 10 чисел наоборот
Вывести на экран числа от 10 до 1, используя цикл while.
*/
import java.io.IOException;

public class Task04Solution13 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int x = 10;

        while (x <= 10 && x > 0) {
            System.out.println(x);
            x--;

        }
    }
}