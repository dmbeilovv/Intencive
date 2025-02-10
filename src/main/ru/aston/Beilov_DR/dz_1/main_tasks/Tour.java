package ru.aston.Beilov_DR.dz_1.main_tasks;

import java.util.Objects;

public abstract class Tour {
    protected User user;
    protected double basePrice;
    protected String destination;

    public Tour(User user, double basePrice, String destination) {
        this.user = user;
        this.basePrice = basePrice;
        this.destination = destination;
    }

    public abstract double calculateDiscount();

    public double calculateFinalPrice() {
        return basePrice * calculateDiscount();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public User getUser() {
        return user;
    }


    @Override
    public int hashCode() {
        return Objects.hash(user, basePrice, destination);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tour tour = (Tour) obj;
        return Double.compare(tour.basePrice, basePrice) == 0 &&
                Objects.equals(user, tour.user) &&
                Objects.equals(destination, tour.destination);
    }

    @Override
    public String toString() {
        return "user: " + user.toString() + ", basePrice: " + basePrice + ", destination: " + destination;
    }
}
