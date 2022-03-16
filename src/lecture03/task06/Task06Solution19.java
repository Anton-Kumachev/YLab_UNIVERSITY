package lecture03.task06;
//package com.javarush.task.task06.task0618;

/*
3. Задача по алгоритмам.
Задача: Программа вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task06Solution19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());

        ArrayList<Integer> sum = new ArrayList<Integer>();
        sum.add(num1);
        sum.add(num2);
        sum.add(num3);
        sum.add(num4);
        sum.add(num5);

        Collections.sort(sum);
        System.out.println(sum.get(0));
        System.out.println(sum.get(1));
        System.out.println(sum.get(2));
        System.out.println(sum.get(3));
        System.out.println(sum.get(4));
    }
}
