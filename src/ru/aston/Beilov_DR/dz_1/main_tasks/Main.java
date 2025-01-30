package ru.aston.Beilov_DR.dz_1.main_tasks;

public class Main {
    public static void main(String[] args) {

        Tests tests = new Tests();

        TourList list = tests.getToursAsArray();

        list.PrintToursList();
        System.out.println("Total price:\n\t" + list.getFinalPrice());

    }
}
