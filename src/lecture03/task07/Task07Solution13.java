package lecture03.task07;
//Примеры по ArrayList и Generics

/*
Пример 1:
Ввод списка целых чисел с клавиатуры
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task07Solution13 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty())
            break; //как только будет пустое поле, будет остановка программы и Exception
            list.add(Integer.parseInt(s));
        }
    }
}
