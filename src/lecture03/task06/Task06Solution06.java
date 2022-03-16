package lecture03.task06;
//package com.javarush.task.task06.task0608;

/*
2. Статические методы: int getCatCount() и setCatCount(int)
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int), с помощью которых можно
получить/изменить количество котов (переменную catCount)
*/

public class Task06Solution06 {
    public static class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            //напишите тут ваш код
            return Cat.catCount;
        }

        public static void setCatCount(int catCount) {
            //напишите тут ваш код
            Cat.catCount = catCount;
        }

        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) { // make 10 cats
                Cat cat = new Cat();
            }
            setCatCount(50); // edit number of cats
            System.out.println(getCatCount());
        }
    }
}