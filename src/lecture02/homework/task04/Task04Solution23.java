package lecture02.homework.task04;
//package com.javarush.task.task04.task0441;

/*
2. Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04Solution23 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 == num2 && num2 == num3) {
            System.out.println(num1);
        } else if (num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 <= num2 || num3 <= num1 && num3 >= num2) {
            System.out.println(num3);
        }
    }
}
