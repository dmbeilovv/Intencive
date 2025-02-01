package ru.aston.Beilov_DR.dz_1.main_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTourTest {

        @Test
        void calculateDiscount_UserAgeBelow60_NoDiscount() {
            User user = new User(50, "John", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(1.0, busTour.calculateDiscount());
        }

        @Test
        void calculateDiscount_UserAge60OrAbove_20PercentDiscount() {
            User user = new User(65, "Jane", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(0.8, busTour.calculateDiscount());
        }

        @Test
        void calculateFinalPrice_UserAgeBelow60_FullPrice() {
            User user = new User(50, "John", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(100.0, busTour.calculateFinalPrice());
        }

        @Test
        void calculateFinalPrice_UserAge60OrAbove_DiscountedPrice() {
            User user = new User(65, "Jane", "Doe");
            BusTour busTour = new BusTour(user, 100.0, "Paris");
            assertEquals(80.0, busTour.calculateFinalPrice());
        }
}