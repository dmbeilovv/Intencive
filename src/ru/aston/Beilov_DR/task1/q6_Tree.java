package ru.aston.Beilov_DR.task1;

public class q6_Tree {

    private int age;
    private boolean isAlive;
    private String name;

    public q6_Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public q6_Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public q6_Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree [age=" + age + ", isAlive=" + isAlive + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        q6_Tree tree1 = new q6_Tree();
        q6_Tree tree2 = new q6_Tree(28,"\"Дерево Валерий\"");
        q6_Tree tree3 = new q6_Tree(66, false, "Берёза");

        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}
