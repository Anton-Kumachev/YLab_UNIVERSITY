package lecture03.task07;
//Примеры по ArrayList и Generics

/*
Пример 2:
То же, чётные числа добавляются в конец списка, нечётные – в начало.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution14 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                for (Integer num : list) {
                System.out.println(list.get(num));
                }
            break;
            }

            int x = Integer.parseInt(s); //переводим String s  в цедлочисленный формат int
            if (x % 2 == 0)             //проверяем, что остаток от деления на два равен нулю
                list.add(x);            //добавление в конец
            else
                list.add(0, x);   //вставка в начало
        }
    }
}
