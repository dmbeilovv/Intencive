package ru.aston.Beilov_DR.dz_3_algorithms;

import java.util.ArrayList;
import java.util.TreeSet;

public class task03 {
    static public <T extends Comparable<T>> T findUnique(ArrayList<T> a) {
        TreeSet<T> set = new TreeSet<T>();
        T res = null;
        T temp = null;
        for (int i = a.size() - 1; i > -1; i--) {
            temp = a.get(i);
            if (!set.contains(temp)) {
                set.add(temp);
                res = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int[] arr = {3, 7, 1, 9, 4, 8, 2, 5, 6, 0, -1};

        for (int num : arr)
            list.add(num);
        System.out.println("Original list: " + list);
        System.out.println("unique elem:\t" + findUnique(list));
    }
}
