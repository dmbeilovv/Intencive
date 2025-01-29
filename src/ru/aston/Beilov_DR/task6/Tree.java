package ru.aston.Beilov_DR.task6;

public class Tree {

    private int age;
    private boolean isAlive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age = " + age + ", isAlive = " + isAlive + ", name = " + name;
    }
}
