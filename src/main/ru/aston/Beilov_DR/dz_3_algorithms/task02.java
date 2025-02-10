package ru.aston.Beilov_DR.dz_3_algorithms;

import java.util.ArrayList;
import java.util.Collection;

public class task02 {
    static public <T extends Comparable<T>> void swapFirstAndLast(ArrayList<T> a) {
        T temp = a.get(0);
        a.set(0, a.get(a.size() - 1));
        a.set(a.size() - 1, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        System.out.println(a.toString());
        swapFirstAndLast(a);
        System.out.println(a.toString());
    }
}