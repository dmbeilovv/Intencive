package ru.aston.Beilov_DR.dz_3_algorithms;

import java.util.ArrayList;

public class task01 {
    static public <T extends Comparable<T>> boolean arrayOrNot(ArrayList<T> a) {
        if (a == null) throw new NullPointerException("The array is null");
        if (a.size() == 1) return true;
        for (int i = 1; i < a.size(); i++)
            if (a.get(i).compareTo(a.get(i-1)) < 0) return false;
        return true;
    }
    static public void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int[] arr = {3, 7, 1, 9, 4, 8, 2, 5, 6, 0, -1};
        for (int num : arr)
            list.add(num);

        System.out.println("Not sorted:\t" + arrayOrNot(list));
        Sort.merge_sort_recursive(list, 0 , list.size() - 1);
        System.out.println("Sorted:\t" + arrayOrNot(list));
    }
}
