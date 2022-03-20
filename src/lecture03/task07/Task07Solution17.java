package lecture03.task07;
//Примеры по ArrayList и Generics

/*
Пример 5:
Слияние списков.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Task07Solution17 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);   //добавление всех значений из одного списка в другой
        result.addAll(list2);

        for (Integer x : result) {  //быстрый foreach по всем элементам, только для коллекций
            System.out.println(x);
        }
    }
}