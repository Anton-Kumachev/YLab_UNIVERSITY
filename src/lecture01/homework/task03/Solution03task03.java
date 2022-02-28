package lecture01.homework.task03;
//package com.javarush.task.task03.task0307;

/*StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.*/

public class Solution03task03 {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "10";

        Protoss protoss1 = new Protoss();
        protoss1.name = "1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "3";
        Protoss protoss4 = new Protoss();
        protoss4.name = "4";
        Protoss protoss5 = new Protoss();
        protoss5.name = "5";

        Terran terran1 = new Terran();
        terran1.name = "1";
        Terran terran2 = new Terran();
        terran2.name = "2";
        Terran terran3 = new Terran();
        terran3.name = "3";
        Terran terran4 = new Terran();
        terran4.name = "4";
        Terran terran5 = new Terran();
        terran5.name = "5";
        Terran terran6 = new Terran();
        terran6.name = "6";
        Terran terran7 = new Terran();
        terran7.name = "7";
        Terran terran8 = new Terran();
        terran8.name = "8";
        Terran terran9 = new Terran();
        terran9.name = "9";
        Terran terran10 = new Terran();
        terran10.name = "10";
        Terran terran11 = new Terran();
        terran11.name = "11";
        Terran terran12 = new Terran();
        terran12.name = "12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
