package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int res = 5 * Integer.parseInt(a) * Integer.parseInt(a) - 5 * Integer.parseInt(b) * Integer.parseInt(b);
        if (res != 0) return res;
        return Integer.parseInt(a) - Integer.parseInt(b);
    }
}
