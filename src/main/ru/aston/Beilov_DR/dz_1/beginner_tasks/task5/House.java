package ru.aston.Beilov_DR.dz_1.beginner_tasks.task5;

import java.time.LocalDate;

public class House {

    private int flores;
    private int dateOfConstruction;
    private String name;

    private boolean isDateOfConstructionVarInitialized;


    public void setAllData(String name, int dateOfConstruction, int flores) {
        this.flores = flores;
        this.dateOfConstruction = dateOfConstruction;
        this.name = name;
    }

    public void printAllData() {
        System.out.println(toString());
    }

    public int yearsFromConstruction() {
        if (isDateOfConstructionVarInitialized) throw new RuntimeException("Date of construction isn't initialized");
        return  LocalDate.now().getYear() - dateOfConstruction;
    }

    @Override
    public String toString() {
        return "Name: " + name + " dateOfConstruction: " + dateOfConstruction + " flores: " + flores;
    }


}
