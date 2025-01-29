package ru.aston.Beilov_DR.task5;

public class Task5Run {
    public static void main(String[] args) {

        House h = new House();
        h.printAllData();
        //System.out.println(h.yearsFromConstruction()); it throws an exception

        h.setAllData("566 Baker Street house", 1986, 9);
        h.printAllData();
        System.out.println(h.yearsFromConstruction() + " years from construction");
    }
}
