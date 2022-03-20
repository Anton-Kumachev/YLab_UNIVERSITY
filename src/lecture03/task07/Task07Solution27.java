package lecture03.task07;
//package com.javarush.task.task07.task0723;

/*
5. Бум
Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.
Пример:
30
29
…
1
0
Бум!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution27 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            //напишите тут ваш код
            Thread.sleep(500);
        }
        System.out.println("Бум!");
    }
}
