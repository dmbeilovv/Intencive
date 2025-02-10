package ru.aston.Beilov_DR.dz_3_algorithms;

import java.util.ArrayList;


public class Sort {
    static private <T extends Comparable<T>> void merge(ArrayList<T> list, int start, int mid, int end) {
        int leftLen = mid - start + 1;
        int rightLen = end - mid;

        ArrayList<T> left = new ArrayList<>(leftLen);
        ArrayList<T> right = new ArrayList<>(rightLen);

        for (int i = 0; i < leftLen; i++) {
            left.add(i, list.get(start + i));
        }
        for (int i = 0; i < rightLen; i++) {
            right.add(i, list.get(i + mid + 1));
        }

        int i = 0, j = 0;
        while (i < leftLen && j < rightLen) {
            if (left.get(i).compareTo(right.get(j)) < 0) {
                list.set(start++, left.get(i++));
                continue;
            }
            list.set(start++, right.get(j++));
        }
        while (i < leftLen)
            list.set(start++, left.get(i++));
        while (j < rightLen)
            list.set(start++, right.get(j++));
    }

    static public <T extends Comparable<T>> void merge_sort_recursive(ArrayList<T> list, int start, int end) {
        if (list == null) {
            throw new NullPointerException("list is null");
        }
        if (start < end) {
            int mid = (end + start) / 2;

            merge_sort_recursive(list, start, mid);
            merge_sort_recursive(list, mid + 1, end);

            merge(list, start, mid, end);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int[] arr = {3, 7, 1, 9, 4, 8, 2, 5, 6, 0, -1};

        for (int num : arr)
            list.add(num);
        System.out.println("Original list: " + list);
        merge_sort_recursive(list, 0, list.size() - 1);
        System.out.println("Sorted list: " + list);
    }
}
