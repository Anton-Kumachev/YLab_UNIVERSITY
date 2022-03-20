package lecture03.task07;
//package com.javarush.task.task07.task0713

/*
1. Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task07Solution18 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> bigList = new ArrayList<>(); //Если прописать ёмкость(initialCapacity) списка
        // это лишь даст нам  размер, которого может достичь список, прежде чем ему в следующий раз
        // потребуется скопировать значения. Это не изменяет логический размер ArrayList.
        // Поэтому list.size() == 0, пока мы не зададим размер списка с помощью цикла.
        ArrayList<Integer> list1 = new ArrayList<>(); //Список1 - числа нацело делится на 3
        ArrayList<Integer> list2 = new ArrayList<>(); //Список2 - числа нацело делится на 2
        ArrayList<Integer> list3 = new ArrayList<>(); //Список3 - все остальные

        for (int i = 0; i < 20; i++) {
            bigList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < bigList.size(); i++) {

            int x = bigList.get(i);

            if (x % 3 == 0) {
                list1.add(x);
            }

            if (x % 2 == 0) {
                list2.add(x);
            } else if (x % 3 != 0 && x % 2 !=0 ){
                list3.add(x);
            }
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}