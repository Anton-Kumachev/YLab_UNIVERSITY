package lecture02.homework.task05;
//package com.javarush.task.task05.task0520;

/*
5. Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя,
ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Task05Solution15 {

    public class Rectangle {
        //напишите тут ваш код
        public int top;
        public int left;
        public int width;
        public int height;

        public Rectangle (int left, int top, int width, int height) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        }
        public Rectangle (int left, int top) {
            this.left = left;
            this.top = top;
        }
        public Rectangle (int left, int top, int width) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = width;
        }
        public Rectangle (Rectangle rectangle) {
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }

        public static void main(String[] args) {

        }
    }
}