package lecture01.homework.task02;
//package com.javarush.task.task02.task0213;

/*
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).
Питомцам нужны люди
*/

public class Task02Solution06 {

    public static void main(String[] args) {

            Cat cat = new Cat();
            Dog dog = new Dog();
            Fish fish = new Fish();
            Woman woman = new Woman();
            cat.owner = woman;
            dog.owner = woman;
            fish.owner = woman;
    }

    public static class Cat {
            public Woman owner;
    }

    public static class Dog {
            public Woman owner;
    }

    public static class Fish {
            public Woman owner;
    }

    public static class Woman {

    }
}
