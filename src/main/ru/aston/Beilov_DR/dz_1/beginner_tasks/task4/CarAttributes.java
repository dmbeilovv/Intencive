package ru.aston.Beilov_DR.dz_1.beginner_tasks.task4;

public class CarAttributes {
    private double weight;
    private String color;
    private String model;


    public CarAttributes() {

    }

    public CarAttributes(String color) {

    }

    public CarAttributes(String color, double weight) {

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

}
