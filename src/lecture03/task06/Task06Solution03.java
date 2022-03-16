package lecture03.task06;
//package com.javarush.task.task06.task0603;

/*
3. По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые,
и метод finalize хоть раз да вызовется).*/

public class Task06Solution03 {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
