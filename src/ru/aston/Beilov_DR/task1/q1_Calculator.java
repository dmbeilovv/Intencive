package ru.aston.Beilov_DR.task1;

public class q1_Calculator {
    public q1_Calculator() {}


    public int summarize(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }


    public double summarize(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return a / b;
    }


    public long summarize(long a, long b) {
        return a + b;
    }
    public long subtract(long a, long b) {
        return a - b;
    }
    public long multiply(long a, long b) {
        return a * b;
    }
    public long divide(long a, long b) {
        return a / b;
    }


    public static void main(String[] args) {
        q1_Calculator c = new q1_Calculator();
        int i = 5;
        double d = 3.14159;
        long l = 666666666L;

        System.out.println(c.summarize(i, i));
        System.out.println(c.divide(d, d));
        System.out.println(c.multiply(l, l));
    }

}