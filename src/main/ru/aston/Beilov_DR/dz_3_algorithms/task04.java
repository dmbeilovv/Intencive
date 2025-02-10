package ru.aston.Beilov_DR.dz_3_algorithms;

import java.util.ArrayList;

public class task04 {

    //Merge sort in the "Sort" class is above.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int[] arr = {3, 7, 1, 9, 4, 8, 2, 5, 6, 0, -1};

        for (int num : arr)
            list.add(num);
        System.out.println("Original list: " + list);
        Sort.merge_sort_recursive(list, 0, list.size() - 1);
        System.out.println("Sorted list: " + list);
    }
}
