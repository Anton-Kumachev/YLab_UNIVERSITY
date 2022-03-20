package lecture03.task07;
//package com.javarush.task.task07.task0703;

/*
3. Два массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает
 с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой
 строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task07Solution03 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayString = new String[10]; //Создаём массив строк на 10 элементов
        int[] array = new int[10]; //Создаём массив чисел на 10 элементов

        for (int i = 0; i < arrayString.length; i++)
        {
            arrayString[i] = reader.readLine(); //Заполнение массива строками с клавиатуры
        }

        for (int j = 0; j < array.length; j++) { //Заполнение массива чисел
            array[j] = arrayString[j].length();
        }
        //вывод на экран
        for (int j = 0; j < array.length; j++)
        {
            System.out.println(array[j]);
        }
    }
}
