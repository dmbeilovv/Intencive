package ru.aston.Beilov_DR.task1;

public class Task1Run {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        Object[][] tests = new Object[][] {
            new Object[]{5,6},
                new Object[]{3.14159,1.111},
                    new Object[]{666666666L,555555L}
        };

        for (var test : tests) {
            if (test[0] instanceof Integer val1 && test[1] instanceof Integer val2) {
                System.out.println("Integer type with values: " + val1 + " and " + val2);
                System.out.println(c.summarize(val1, val2));
                System.out.println(c.subtract(val1, val2));
                System.out.println(c.multiply(val1, val2));
                System.out.println(c.divide(val1, val2));
                System.out.println();
            } else if (test[0] instanceof Double val1 && test[1] instanceof Double val2) {
                System.out.println("Double type with values: " + val1 + " and " + val2);
                System.out.println(c.summarize(val1, val2));
                System.out.println(c.subtract(val1, val2));
                System.out.println(c.multiply(val1, val2));
                System.out.println(c.divide(val1, val2));
                System.out.println();
            } else if (test[0] instanceof Long val1 && test[1] instanceof Long val2) {
                System.out.println("Long type with values: " + val1 + " and " + val2);
                System.out.println(c.summarize(val1, val2));
                System.out.println(c.subtract(val1, val2));
                System.out.println(c.multiply(val1, val2));
                System.out.println(c.divide(val1, val2));
                System.out.println();
            }
            else {
                throw new NumberFormatException("test failed");
            }
        }
    }
}
