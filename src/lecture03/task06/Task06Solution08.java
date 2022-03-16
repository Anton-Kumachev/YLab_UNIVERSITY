package lecture03.task06;
//package com.javarush.task.task06.task0610;

/*
4. Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую
переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task06Solution08 {
    public class ConsoleReader {
        public static String readString() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            return str;
        }

        public static int readInt() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());
            return num;
        }

        public static double readDouble() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double numDouble = Double.parseDouble(reader.readLine());
            return numDouble;
        }

        public static boolean readBoolean() throws Exception {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean numBoolean = Boolean.parseBoolean(reader.readLine());
            return numBoolean;
        }

        public static void main(String[] args) throws Exception {

        }
    }
}