package ru.aston.Beilov_DR.task1;

public class q4_CarAttributes {
    private double weight;
    private String color;
    private String model;


    public q4_CarAttributes() {

    }

    public q4_CarAttributes(String color) {

    }

    public q4_CarAttributes(String color, double weight) {

    }


    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public void PrintAll() {
        System.out.println("weight: " + weight + " color: " + color + " model: " + model);
    }

    public static void main(String[] args) {
        q4_CarAttributes obj = new q4_CarAttributes();
        obj.PrintAll();
        obj.setWeight(1.0);
        obj.setColor("red");
        obj.PrintAll();


        q4_CarAttributes obj2 = new q4_CarAttributes("green", 5.5);
        obj2.PrintAll();
    }
}
