package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for (Integer a : sourceList) {
            if (a % 2 == 0)
                res.addLast(a);
            else res.addFirst(a);
        }

        return res;
    }
}
