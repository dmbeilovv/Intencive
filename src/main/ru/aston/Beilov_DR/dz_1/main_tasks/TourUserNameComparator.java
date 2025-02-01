package ru.aston.Beilov_DR.dz_1.main_tasks;

import java.util.Comparator;

public class TourUserNameComparator implements Comparator<Tour> {

    @Override
    public int compare(Tour o1, Tour o2) {

        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }


        String name1 = o1.getUser() != null ? o1.getUser().getName() : null;
        String name2 = o2.getUser() != null ? o2.getUser().getName() : null;


        if (name1 == null && name2 == null) {
            return 0;
        }
        if (name1 == null) {
            return -1;
        }
        if (name2 == null) {
            return 1;
        }


        return name1.compareTo(name2);
    }
}