package com.epam.automation.javacollections.maintask.model.flower;

import java.util.Comparator;

public class ComparatorFlower implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        return Integer.compare(o1.getFreshnessClass(), o2.getFreshnessClass());
    }
}
