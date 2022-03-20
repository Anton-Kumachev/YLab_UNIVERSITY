package lecture03.task07;
//package com.javarush.task.task07.task0716;

/*
4. Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

import java.util.ArrayList;

public class Task07Solution21 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);

            Boolean r = strings.get(i).contains("р");
            Boolean l = strings.get(i).contains("л");

            if (r && !l) {
                strings.remove(str);
                i--;
            }
            if (l && !r) {
                strings.add(i, strings.get(i));
                i++;
            }
        }
        return strings;
    }
}