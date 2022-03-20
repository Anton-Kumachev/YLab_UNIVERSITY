package lecture03.task07;
//Примеры по ArrayList и Generics

/*
Пример 4:
Разделение массива на два – чётных и нечётных чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution16 {

    public static void main(String[] args) throws Exception {
        //статическая инициализация массива
        int[] data = {1, 2, 5, 8, 6, 10, 11, 3, 15, 7, 8};

        //создание списка, где все элементы должны быть типа Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        //заполнение списка из массива
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }

        for (Integer numEven : even) {
            System.out.println("Чётное число: " + numEven);
        }
        for (Integer numOdd : odd) {
            System.out.println("Нечётное число: " + numOdd);
        }
    }
}
