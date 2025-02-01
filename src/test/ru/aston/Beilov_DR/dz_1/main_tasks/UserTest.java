package ru.aston.Beilov_DR.dz_1.main_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testEquals_SameUser_ReturnsTrue() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(30, "John", "Doe");
        assertTrue(user1.equals(user2));
    }

    @Test
    void testEquals_DifferentUser_ReturnsFalse() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(25, "Jane", "Doe");
        assertFalse(user1.equals(user2));
    }

    @Test
    void testHashCode_SameUser_SameHashCode() {
        User user1 = new User(30, "John", "Doe");
        User user2 = new User(30, "John", "Doe");
        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    void testToString_ReturnsCorrectString() {
        User user = new User(30, "John", "Doe");
        assertEquals("John Doe 30", user.toString());
    }
}