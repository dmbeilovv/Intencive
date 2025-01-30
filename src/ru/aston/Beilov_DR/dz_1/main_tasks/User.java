package ru.aston.Beilov_DR.dz_1.main_tasks;

import java.util.Objects;

public class User {
    private int age;
    private String name;
    private String surname;

    public User(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return surname;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return (age == user.age) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}