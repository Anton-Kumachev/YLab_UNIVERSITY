package lecture02.homework.task05;
//package com.javarush.task.task05.task0502;

/*
2. Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса,
возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е.
возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
*/


public class Task05Solution02 { //Cat
    public int age;
    public int weight;
    public int strength;

    public Task05Solution02() { //Cat
    }

    public boolean fight(Task05Solution02 anotherCat) { //Cat
        //напишите тут ваш код
        int countanotherCat = 0;
        int countCat = 0;
        if (this.age > anotherCat.age) {
            countCat++;
        } else if (this.age < anotherCat.age) {
            countanotherCat++;
        }

        if (this.weight > anotherCat.weight) {
            countCat++;
        } else if (this.weight < anotherCat.weight) {
            countanotherCat++;
        }

        if (this.strength > anotherCat.strength) {
            countCat++;
        } else if (this.strength < anotherCat.strength) {
            countanotherCat++;
        }

        if (countCat > countanotherCat) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
