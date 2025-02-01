package ru.aston.Beilov_DR.dz_1.beginner_tasks.task2;

public class Some_random_instance {

    private int age;
    private boolean isAlive;
    private String name;

    public Some_random_instance() {}

    public Some_random_instance(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "age = " + age + ", isAlive = " + isAlive + ", name = " + name;
    }
}
