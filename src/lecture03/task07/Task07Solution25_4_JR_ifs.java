package lecture03.task07;
//package com.javarush.task.task07.task0721;

/*
3. Максимальное и минимальное числа в массиве
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
//Решение через if-ы и минимум/маскимум (РЕШЕНИЕ JR)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task07Solution25_4_JR_ifs {

    public static void main(String[] args) throws Exception {
        int maximum;
        int minimum;
        //напишите тут ваш код
        int[] array = getInts(); //Присваивание массиву значений введёных с клавиатуры
        //Поиск максимама и минимума, через условия (массив не сортируется по возрастанию):
        maximum = array[0];
        minimum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Максимальное значение массива: " + maximum + "\n" + "Минимальное значение массива: " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}