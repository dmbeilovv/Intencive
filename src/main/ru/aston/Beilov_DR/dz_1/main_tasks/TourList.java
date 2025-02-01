package ru.aston.Beilov_DR.dz_1.main_tasks;

import java.util.*;

public class TourList {

    ArrayList<Tour> tours = new ArrayList<Tour>();

    public TourList() {}

    public TourList(ArrayList<Tour> tours) {
        this.tours = tours;
    }


    public void add(Tour tour) {
        tours.add(tour);
    }
    public boolean delete(Tour tour) {
        return tours.remove(tour);
    }

    public ArrayList<Tour> getToursList() {
        return new ArrayList<>(tours);
    }

    public double getFinalPrice() {
        double sum = 0.0;
        for (Tour tour : tours)
            sum += tour.calculateFinalPrice();
        return sum;
    }

    private void sortListByUsersName() {
        tours.sort(new TourUserNameComparator());
    }

    public void PrintToursList() {
        sortListByUsersName();
        System.out.println("Tours list(sorted by user name):");
        for (var tour : tours) {
            System.out.println("\t" + tour.toString());
        }
    }

}