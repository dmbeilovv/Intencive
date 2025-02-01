package ru.aston.Beilov_DR.dz_1.beginner_tasks.task6;

public class Task6Run {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(28,"\"Дерево Валерий\"");
        Tree tree3 = new Tree(66, false, "Берёза");

        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}
