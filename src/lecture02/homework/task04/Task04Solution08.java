package lecture02.homework.task04;
//package com.javarush.task.task04.task0420;

/*
Задача 3. Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution08 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = a >= b ? a : b;
        max = max >= c ? max : c;

        int min = a <= b ? a : b;
        min = min <= c ? min : c;

        int mid = a + b + c - max - min;
       /* if (a >= min && a <= max) {
            mid = a;
        } else if (b >= min && b <= max) {
            mid = b;
        } else if (c >= min && c <= max){
            mid = c;
        }*/
        System.out.println(max + " " + mid + " " + min);
    }
}
