package ru.aston.Beilov_DR.dz_1.main_tasks;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TourListTest {

    void add_Tour_AddsTourToList() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");
        TourList tourList = new TourList();

        tourList.add(tour);
        assertEquals(1, tourList.getToursList().size());
        assertTrue(tourList.getToursList().contains(tour));
    }

    @Test
    void delete_Tour_RemovesTourFromList() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");
        TourList tourList = new TourList(new ArrayList<>(List.of(tour)));

        assertTrue(tourList.delete(tour));
        assertEquals(0, tourList.getToursList().size());
        assertFalse(tourList.getToursList().contains(tour));
    }

    @Test
    void delete_NonExistentTour_ReturnsFalse() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");
        TourList tourList = new TourList();

        assertFalse(tourList.delete(tour));
    }

    @Test
    void getFinalPrice_CalculatesTotalPriceCorrectly() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(65, "Jane", "Doe");
        Tour tour1 = new BusTour(user1, 100.0, "Paris");
        Tour tour2 = new BusTour(user2, 100.0, "Paris");

        TourList tourList = new TourList(new ArrayList<>(List.of(tour1, tour2)));

        assertEquals(180.0, tourList.getFinalPrice());
    }

    @Test
    void sortListByUsersName_SortsToursByUserName() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(25, "Alice", "Smith");
        User user3 = new User(40, "Bob", "Johnson");

        Tour tour1 = new BusTour(user1, 100.0, "Paris");
        Tour tour2 = new BusTour(user2, 150.0, "London");
        Tour tour3 = new BusTour(user3, 200.0, "Berlin");

        TourList tourList = new TourList(new ArrayList<>(List.of(tour1, tour2, tour3)));

        tourList.PrintToursList();
        ArrayList<Tour> sortedTours = tourList.getToursList();

        assertEquals("Alice", sortedTours.get(0).getUser().getName());
        assertEquals("Bob", sortedTours.get(1).getUser().getName());
        assertEquals("John", sortedTours.get(2).getUser().getName());
    }

    @Test
    void getToursList_ReturnsCopyOfList() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");
        TourList tourList = new TourList(new ArrayList<>(List.of(tour)));

        ArrayList<Tour> copiedList = tourList.getToursList();
        copiedList.remove(tour);

        assertEquals(1, tourList.getToursList().size());
        assertTrue(tourList.getToursList().contains(tour));
    }
}