package ru.aston.Beilov_DR.dz_1.main_tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TourTest {

    @Test
    void testEqualsSameToursReturnsTrue() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(30, "John", "Doe");
        Tour tour1 = new BusTour(user1, 100.0, "Paris");
        Tour tour2 = new BusTour(user2, 100.0, "Paris");

        assertTrue(tour1.equals(tour2));
    }

    @Test
    void testEqualsDifferentToursReturnsFalse() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(25, "Jane", "Doe");
        Tour tour1 = new BusTour(user1, 100.0, "Paris");
        Tour tour2 = new BusTour(user2, 150.0, "London");

        assertFalse(tour1.equals(tour2));
    }

    @Test
    void calculateFinalPriceNoDiscountReturnsBasePrice() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");

        assertEquals(100.0, tour.calculateFinalPrice());
    }

    @Test
    void calculateFinalPriceWithDiscountReturnsDiscountedPrice() {
        User user = new User(65, "Jane", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");

        assertEquals(80.0, tour.calculateFinalPrice());
    }

    @Test
    void getBasePriceReturnsCorrectValue() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");

        assertEquals(100.0, tour.getBasePrice());
    }

    @Test
    void getUserReturnsCorrectUser() {
        User user = new User(30, "John", "Doe");
        Tour tour = new BusTour(user, 100.0, "Paris");

        assertEquals(user, tour.getUser());
    }
}