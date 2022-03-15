package lecture02.homework.task05;
//package com.javarush.task.task05.task0526;

/*
2. Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Task05Solution17 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Anton", 37, "town Tomsk");
        Man man2 = new Man("Mark", 9, "town Tomsk");
        Woman woman1 = new Woman("Liza", 30, "town Tomsk");
        Woman woman2 = new Woman("Sofia", 4, "town Tomsk");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }
    //напишите тут ваш код
    public static class Man {
        public String name;
        public int age;
        public String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}