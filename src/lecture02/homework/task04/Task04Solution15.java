package lecture02.homework.task04;
//package com.javarush.task.task04.task0433;

/*
4. S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution15 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int n = 0;
        while (n < 10) {
            int i = 0;
            while (i < 10) {
                System.out.print(" S ");
                i++;
            }
            System.out.println();
            n++;
        }
    }
}
