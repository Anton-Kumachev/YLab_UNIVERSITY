package lecture03.task07;
//package com.javarush.task.task07.task0721;

/*
3. Максимальное и минимальное числа в массиве
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
//Решение с помощью системного метода сортировки sort() класса Arrays

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task07Solution25_1_sort {

    public static void main(String[] args) throws Exception {
        int maximum;
        int minimum;
        //напишите тут ваш код
        int[] array = getInts();
        Arrays.sort(array); //Сортируем массив
        System.out.println("Перед Вами отсортированный массив чисел: ");
        //Вывод в консоль отсортированного массива:

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        maximum = array[array.length - 1]; //Выделяем из отсортированнного массива максимальный элемент
        minimum = array[0];

        System.out.println("Максимальное значение массива: " + maximum + "\n" + "Минимальное значение массива: " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}