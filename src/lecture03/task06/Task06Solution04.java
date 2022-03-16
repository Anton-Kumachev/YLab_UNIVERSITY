package lecture03.task06;
//package com.javarush.task.task06.task0604;

/*
4. Счётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную catCount этого же класса)
на 1. В методе finalize уменьшать на 1.
*/

public class Task06Solution04 {
    public class Cat {
        public static int catCount = 0;

        //напишите тут ваш код
        public Cat() {
            catCount++;
        }

        protected void finalize() throws Throwable {
            catCount--;
        }

        public static void main(String[] args) {

        }
    }
}