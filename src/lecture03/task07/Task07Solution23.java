package lecture03.task07;
//package com.javarush.task.task07.task0719;

/*
1. Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Используя цикл for вывести их в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution23 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num =Integer.parseInt(reader.readLine());
            numbers.add(num);
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}