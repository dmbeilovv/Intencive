package ru.aston.Beilov_DR.task4;

public class Task4Run {
    public static void main(String[] args) {
        CarAttributes obj = new CarAttributes();
        obj.PrintAll();
        obj.setWeight(1.0);
        obj.setColor("red");
        obj.PrintAll();


        CarAttributes obj2 = new CarAttributes("green", 5.5);
        obj2.PrintAll();
    }
}
