package ru.aston.Beilov_DR.dz_1.main_tasks;

public class PlaneTour extends Tour {

    public PlaneTour(User user, double basePrice, String destination) {
        super(user, basePrice, destination);
    }

    @Override
    public double calculateDiscount() {
        return switch (destination) {
            case "China" -> 0.92;
            case "India" -> 0.85;
            default -> 1;
        };
    }
}
