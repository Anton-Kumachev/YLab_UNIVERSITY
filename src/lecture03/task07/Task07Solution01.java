package lecture03.task07;
//package com.javarush.task.task07.task0701;

/*
1. Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task07Solution01 {
    public static void main(String[] args) throws Exception {
    int[] array = initializeArray();
    int max = max(array);
        System.out.println(max);
}

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20]; //Создание массива

        for (int i = 0; i < array.length; i++) { //Заполнение массива с консоли
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max (int[] array) {
        // найди максимальное значение
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
