package ru.aston.Beilov_DR.task2;

public class Task2Run {
    public static void main(String[] args) {
        Some_random_instance tree1 = new Some_random_instance();
        Some_random_instance tree3 = new Some_random_instance(66, false, "Берёза");

        System.out.println(tree1.toString());
        System.out.println(tree3.toString());
    }
}
