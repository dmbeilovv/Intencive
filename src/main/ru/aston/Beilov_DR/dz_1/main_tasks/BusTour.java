package ru.aston.Beilov_DR.dz_1.main_tasks;

public class BusTour extends Tour {
    public BusTour(User user, double basePrice, String destination) {
        super(user, basePrice, destination);
    }

    @Override
    public double calculateDiscount() {
        if (user.getAge() >= 60)
            return 0.8;
        return 1;
    }
}
