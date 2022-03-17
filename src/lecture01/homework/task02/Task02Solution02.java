package lecture01.homework.task02;
//package com.javarush.task.task02.task0209;

/*
Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".
Макс, Белла и Джек
*/

public class Task02Solution02 {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        //напишите тут ваш код
        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";
        }

    public static class Dog {
        public String name;
    }
}
