package lecture03.task06;
//package com.javarush.task.task06.task0611;

/*
5. Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку, повторенную count раз.
String multiply(String s) – возвращает строку, повторенную 5 раз.
Пример:
Амиго → АмигоАмигоАмигоАмигоАмиго
*/

public class Task06Solution09 {

        public static String multiply(String text) {
            String result = "";
            //напишите тут ваш код
            for (int i = 0; i < 5; i++) {
                result = result + text;
            }
            return result;
        }

        public static String multiply(String text, int count) {
            String result = "";
            //напишите тут ваш код
            for (int j = 0; j < count; j++) {
                result = result + text;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(multiply("Hello!"));
            System.out.println(multiply("Hello!", 10));

        }
}
