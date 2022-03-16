package lecture03.task06;
//package com.javarush.task.task06.task0609;

/*
3. Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Task06Solution07 {

        public static double getDistance(int x1, int y1, int x2, int y2) {
            //напишите тут ваш код
            int x = x2 - x1;
            double xd = (double)x;

            int y = y2 - y1;
            double yd = (double)y;

            double a = (xd * xd) + (yd * yd);
            double dist = Math.sqrt(a);
            return dist;
        }

        public static void main(String[] args) {
            System.out.println(getDistance(10, 20, 10, 20 ));
        }
    }
