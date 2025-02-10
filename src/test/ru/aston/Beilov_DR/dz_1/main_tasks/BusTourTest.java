package ru.aston.Beilov_DR.dz_1.main_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTourTest {

        @Test
        void testCalculateDiscountUserAgeBelow60NoDiscount() {
            User user = new User(50, "John", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(1.0, busTour.calculateDiscount());
        }

        @Test
        void testCalculateDiscountUserAge60OrAbove20PercentDiscount() {
            User user = new User(65, "Jane", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(0.8, busTour.calculateDiscount());
        }

        @Test
        void testCalculateFinalPriceUserAgeBelow60FullPrice() {
            User user = new User(50, "John", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(100.0, busTour.calculateFinalPrice());
        }

        @Test
        void testCalculateFinalPriceUserAge60OrAboveDiscountedPrice() {
            User user = new User(65, "Jane", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(80.0, busTour.calculateFinalPrice());
        }
}