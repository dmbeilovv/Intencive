package ru.aston.Beilov_DR.dz_1.main_tasks;

import java.util.ArrayList;

public class Tests {

    private TourList tests;

    public Tests() {
        ArrayList<User> tours = new ArrayList<User>();
        tours.add(new User(56, "Lena", "Golovach"));
        tours.add(new User(16, "Sasha", "Berta"));
        tours.add(new User(67, "Kyzhya", "Morik"));

        tours.add(new User(33, "John", "Morrison"));
        tours.add(new User(15, "Ann", "Smith"));
        tours.add(new User(66, "Bob", "Anderson"));


        TourList cases = new TourList();
        cases.add(new PlaneTour(tours.get(0),1600.0, "Malibu"));
        cases.add(new PlaneTour(tours.get(1),900.0, "China"));
        cases.add(new PlaneTour(tours.get(2),1999.0, "India"));

        cases.add(new BusTour(tours.get(3),1500.0, "Belarus"));
        cases.add(new BusTour(tours.get(4),900.0, "Germany"));
        cases.add(new BusTour(tours.get(5),1000.0, "Malibu"));

        tests = cases;
    }

    public void setTests(TourList tests) {
        this.tests = tests;
    }

    public TourList getToursAsArray() {
            return tests;
    }
}
