package ru.aston.Beilov_DR.dz_1.main_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTourTest {

    @Test
    void testCalculateDiscountDestinationChina8PercentDiscount() {
        User user = new User(30, "John", "Doe");
        PlaneTour planeTour = new PlaneTour(user, 100.0, "China");
        assertEquals(0.92, planeTour.calculateDiscount());
    }

    @Test
    void testCalculateDiscountDestinationIndia15PercentDiscount() {
        User user = new User(30, "Jane", "Doe");
        PlaneTour planeTour = new PlaneTour(user, 100.0, "India");
        assertEquals(0.85, planeTour.calculateDiscount());
    }

    @Test
    void tesstCalculateDiscountDestinationOtherNoDiscount() {
        User user = new User(30, "John", "Doe");
        PlaneTour planeTour = new PlaneTour(user, 100.0, "USA");
        assertEquals(1.0, planeTour.calculateDiscount());
    }

}