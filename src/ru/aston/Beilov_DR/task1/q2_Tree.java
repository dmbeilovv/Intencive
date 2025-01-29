package ru.aston.Beilov_DR.task1;

public class q2_Tree {

    private int age;
    private boolean isAlive;
    private String name;

    public q2_Tree() {}

    public q2_Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree [age=" + age + ", isAlive=" + isAlive + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        q2_Tree tree1 = new q2_Tree();
        q2_Tree tree3 = new q2_Tree(66, false, "Берёза");

        System.out.println(tree1.toString());
        System.out.println(tree3.toString());
    }
}
